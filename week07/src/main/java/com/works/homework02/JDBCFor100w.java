package com.works.homework02;

import java.sql.*;

public class JDBCFor100w {

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        //获取连接
        String url = "jdbc:mysql://localhost:3306/TEST?rewriteBatchedStatements=true";
        Connection conn = null;
        Statement stat = null;
        ResultSet rs4Cons = null;
        try{
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // Class.forName("com.ibm.db2.jcc.DB2Driver");

            conn = DriverManager.getConnection(url,"root","root");
            System.out.println(conn);
            stat = conn.createStatement();

            for(int i=1000002;i<=2000001;i++){
                stat.executeUpdate(" INSERT INTO t_order_detail2 (ORDER_ID,PRODUCT_ID,USER_ID,MERID,ORDER_DATE,STATE,INTIME,MODTIME,ADRESS_ID,LINK_NAME,LINK_MOBILE_ID,PROVICE_CODE,CITY_CODE,ADRESS_DETAIL) VALUES('"+ Integer.toString(i) +"','"+ Integer.toString(i) +"','1','1','1','1',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,'1','1','1','1','1','1');");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(null != rs4Cons){
                try {
                    rs4Cons.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(null != stat){
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(null != conn){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        //682731ms
        System.out.println("插入100w数据所花时间为："+runTime);
    }
}
