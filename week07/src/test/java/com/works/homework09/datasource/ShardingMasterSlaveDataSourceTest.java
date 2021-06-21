package com.works.homework09.datasource;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootTest
public class ShardingMasterSlaveDataSourceTest {
    //@Autowired
    //ShardingMasterSlaveDataSource shardingMasterSlaveDataSource;

    /**
     * 运行后从日志可以看出主从之间的切换和从库负载均衡
     */
    @Test
    @Transactional
    public void test() throws SQLException {
        ShardingMasterSlaveDataSource shardingMasterSlaveDataSource = new ShardingMasterSlaveDataSource();
        DataSource dataSource = shardingMasterSlaveDataSource.createDataSource();
        System.out.println("ShardingMasterSlaveDataSource info::" + dataSource.getConnection().getMetaData().getURL());

        Connection conn = dataSource.getConnection();
        Statement statement = conn.createStatement();

        String sql = "select count(1) from t_order_detail2";
        statement.execute(sql);
        statement.execute(sql);

        sql = "INSERT INTO t_order_detail2 (ORDER_ID,PRODUCT_ID,USER_ID,MERID,ORDER_DATE,STATE,INTIME,MODTIME,ADRESS_ID,LINK_NAME,LINK_MOBILE_ID,PROVICE_CODE,CITY_CODE,ADRESS_DETAIL) VALUES('aa','aa','1','1','1','1',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,'1','1','1','1','1','1');";
        statement.execute(sql);

        sql = "select count(1) from t_order_detail2 ";
        statement.execute(sql);
    }

}