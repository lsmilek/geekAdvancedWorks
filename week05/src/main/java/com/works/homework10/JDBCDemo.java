package com.works.homework10;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args){
        insert();

        query();



    }

    private static void query() {
        //获取连接
        String url = "jdbc:mysql://localhost:3306/TEST";
        // String url = "jdbc:db2://10.10.52.32:60000/upontest";
        Connection conn = null;
        Statement stat = null;
        ResultSet rs4Cons = null;
        try{
            //1、注册驱动
             Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("com.ibm.db2.jcc.DB2Driver");

            conn = DriverManager.getConnection(url,"root","root");
            System.out.println(conn);
            stat = conn.createStatement();
            rs4Cons = stat.executeQuery("select * from T_PROVIDER_TRANSMAP where MERORDERNO='12345678'");
            while (rs4Cons.next()) {
                // 获取每列的数据,使用的是ResultSet接口的方法getXXX
                String trace = rs4Cons.getString("trace");

                System.out.println(trace);
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
    }

    private static void insert(){
        //获取连接
        String url = "jdbc:mysql://localhost:3306/TEST";
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

            rs4Cons = stat.executeQuery("select * from T_PROVIDER_TRANSMAP where MERORDERNO='12345678'");
            while (rs4Cons.next()) {
                // 获取每列的数据,使用的是ResultSet接口的方法getXXX
                String trace = rs4Cons.getString("trace");

                System.out.println(trace);
            }

            stat.executeUpdate(" INSERT INTO T_PROVIDER_TRANSMAP (MERORDERNO, TRACE) VALUES('12345678', '12345678') ");


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

    }
}
