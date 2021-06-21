package com.works.homework09.datasource;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;
import com.google.code.shardbatis.plugin.ShardPlugin;


@Configuration
@MapperScan("com.works.homework09.mapper")
public class MyBatisConfig implements EnvironmentAware {

    private RelaxedPropertyResolver propertyResolverOn;

    private RelaxedPropertyResolver propertyResolverOff;


    @Autowired
    private ConfigurableEnvironment env;

    @Override
    public void setEnvironment(Environment env) {
        this.propertyResolverOn = new RelaxedPropertyResolver(env, "spring.datasource-on.");
        this.propertyResolverOff = new RelaxedPropertyResolver(env, "spring.datasource-off.");
    }



    @Bean(name = "dataSourceOn")
    public DataSource dataSourceOn() {
      return buildDataSource(propertyResolverOn);
    }


    @Bean(name = "dataSourceOff")
    public DataSource dataSourceOff() {
        return buildDataSource(propertyResolverOff);
    }


    private DataSource buildDataSource(RelaxedPropertyResolver relaxedPropertyResolver){
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(relaxedPropertyResolver.getProperty("url"));
        datasource.setDriverClassName(relaxedPropertyResolver.getProperty("driver-class-name"));
        datasource.setUsername(relaxedPropertyResolver.getProperty("username"));
        datasource.setPassword(relaxedPropertyResolver.getProperty("password"));
        datasource.setInitialSize(Integer.valueOf(relaxedPropertyResolver.getProperty("initial-size")));
        datasource.setMinIdle(Integer.valueOf(relaxedPropertyResolver.getProperty("min-idle")));
        datasource.setMaxWait(Long.valueOf(relaxedPropertyResolver.getProperty("max-wait")));
        datasource.setMaxActive(Integer.valueOf(relaxedPropertyResolver.getProperty("max-active")));
        datasource.setMinEvictableIdleTimeMillis(Long.valueOf(relaxedPropertyResolver.getProperty("min-evictable-idle-time-millis")));
        datasource.setTimeBetweenEvictionRunsMillis(Long.valueOf(relaxedPropertyResolver.getProperty("time-between-eviction-runs-millis")));
        datasource.setValidationQuery(relaxedPropertyResolver.getProperty("validationQuery"));
        datasource.setTestWhileIdle(Boolean.parseBoolean(relaxedPropertyResolver.getProperty("test-while-idle")));
        datasource.setTestOnBorrow(Boolean.parseBoolean(relaxedPropertyResolver.getProperty("test-on-borrow")));
        datasource.setTestOnReturn(Boolean.parseBoolean(relaxedPropertyResolver.getProperty("test-on-return")));;
        datasource.setTestWhileIdle(Boolean.parseBoolean(relaxedPropertyResolver.getProperty("testWhileIdle")));
        datasource.setPoolPreparedStatements(Boolean.parseBoolean(relaxedPropertyResolver.getProperty("poolPreparedStatements")));
        datasource.setMaxPoolPreparedStatementPerConnectionSize(Integer.valueOf(relaxedPropertyResolver.getProperty("maxPoolPreparedStatementPerConnectionSize")));
        datasource.setConnectionProperties(relaxedPropertyResolver.getProperty("connectionProperties"));

        try {
            datasource.setFilters("stat,wall");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datasource;
    }


    @Bean
    @Primary
    public DynamicDataSource dataSource(@Qualifier("dataSourceOn") DataSource dataSourceOn,
                                        @Qualifier("dataSourceOff") DataSource dataSourceOff) {
        Map<Object, Object> targetDataSources = new HashMap<>(3);
        targetDataSources.put(DatabaseType.dataSourceOn, dataSourceOn);
        targetDataSources.put(DatabaseType.dataSourceOff, dataSourceOff);

        DynamicDataSource dataSource = new DynamicDataSource();
        // 该方法是AbstractRoutingDataSource的方法
        dataSource.setTargetDataSources(targetDataSources);
        // 默认的datasource设置为dataSourceOn
        dataSource.setDefaultTargetDataSource(dataSourceOn);

        return dataSource;
    }



    @Bean
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSourceOn") DataSource dataSourceOn,
                                               @Qualifier("dataSourceOff") DataSource dataSourceOff) throws Exception {
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();

        /** 分表插件begin **/
        ShardPlugin shardPlugin = new ShardPlugin();
        Properties shardProperties = new Properties();
        shardProperties.setProperty("shardingConfig", env.getProperty("mybatis.shardingConfig"));
        shardPlugin.setProperties(shardProperties);
        /** 分表插件end **/
        // 添加插件
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        //https://pagehelper.github.io/docs/howtouse/
        //分页合理化参数
        properties.setProperty("reasonable","true");
        pageInterceptor.setProperties(properties);
        fb.setPlugins(new Interceptor[]{shardPlugin,pageInterceptor});

        fb.setDataSource(this.dataSource(dataSourceOn, dataSourceOff));
        fb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));
        fb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/*.xml"));
        return fb.getObject();
    }



    @Bean
    public DataSourceTransactionManager transactionManager(DynamicDataSource dataSource) throws Exception {
        return new DataSourceTransactionManager(dataSource);
    }

}
