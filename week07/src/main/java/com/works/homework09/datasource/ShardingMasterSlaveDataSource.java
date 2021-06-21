package com.works.homework09.datasource;

import com.zaxxer.hikari.HikariDataSource;
import io.shardingsphere.api.config.MasterSlaveRuleConfiguration;
import io.shardingsphere.shardingjdbc.api.MasterSlaveDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Component
public class ShardingMasterSlaveDataSource {

    @Bean
    DataSource createDataSource() throws SQLException {
        // 配置真实数据源
        Map<String, DataSource> dataSourceMap = new HashMap<>();

        // 配置主库
        HikariDataSource masterDataSource = new HikariDataSource();
        masterDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        masterDataSource.setJdbcUrl("jdbc:mysql://localhost:3316/TEST");
        masterDataSource.setUsername("root");
        masterDataSource.setPassword("root");
        dataSourceMap.put("ds_master", masterDataSource);

        // 配置第一个从库
        HikariDataSource slaveDataSource1 = new HikariDataSource();
        slaveDataSource1.setDriverClassName("com.mysql.jdbc.Driver");
        slaveDataSource1.setJdbcUrl("jdbc:mysql://localhost:3326/TEST");
        slaveDataSource1.setUsername("root");
        slaveDataSource1.setPassword("root");
        dataSourceMap.put("ds_slave0", slaveDataSource1);

        // 配置第二个从库
        HikariDataSource slaveDataSource2 = new HikariDataSource();
        slaveDataSource2.setDriverClassName("com.mysql.jdbc.Driver");
        slaveDataSource2.setJdbcUrl("jdbc:mysql://localhost:3336/TEST");
        slaveDataSource2.setUsername("root");
        slaveDataSource2.setPassword("root");
        dataSourceMap.put("ds_slave1", slaveDataSource2);

        // 配置读写分离规则
        MasterSlaveRuleConfiguration masterSlaveRuleConfig = new MasterSlaveRuleConfiguration("ds_master_slave", "ds_master", Arrays.asList("ds_slave0", "ds_slave1"));
        Properties properties = new Properties();
        properties.setProperty("sql.show", "true");
        // 获取数据源对象
        return MasterSlaveDataSourceFactory.createDataSource(dataSourceMap, masterSlaveRuleConfig ,new HashMap<>(0), properties);
    }
}
