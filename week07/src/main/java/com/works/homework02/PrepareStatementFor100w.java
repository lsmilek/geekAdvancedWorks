package com.works.homework02;

import java.sql.*;

public class PrepareStatementFor100w {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        long midTime = 0L;
        String insertSql = " INSERT INTO t_order_detail2 (ORDER_ID,PRODUCT_ID,USER_ID,MERID,ORDER_DATE,STATE,INTIME,MODTIME,ADRESS_ID,LINK_NAME,LINK_MOBILE_ID,PROVICE_CODE,CITY_CODE,ADRESS_DETAIL) VALUES(?,?,'1','1','1','1',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,'1','1','1','1','1','1');";
        //获取连接
        String url = "jdbc:mysql://localhost:3306/TEST?rewriteBatchedStatements=true";
        //  String url = "jdbc:db2://10.10.52.32:60000/upontest&rewriteBatchedStatements=true";
        Connection conn = null;
        PreparedStatement prestat = null;
        ResultSet rs4Cons = null;
        try{
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("com.ibm.db2.jcc.DB2Driver");

            conn = DriverManager.getConnection(url,"root","root");
            System.out.println(conn);
            prestat = conn.prepareStatement(insertSql);
            conn.setAutoCommit(false);//1,首先把Auto commit设置为false,不让它自动提交
            for(int i=2000002;i<=3000001;i++){
                prestat.setString(1,Integer.toString(i));
                prestat.setString(2,Integer.toString(i));
                prestat.addBatch();
            }
            midTime = System.currentTimeMillis();
            System.out.println("组装插入100w数据所花时间为："+(midTime-startTime));
            prestat.executeBatch();
            System.out.println("插入成功！");
            // 若成功执行完所有的插入操作，则正常结束
            conn.commit();//2,进行手动提交（commit）
            System.out.println("提交成功!");
            conn.setAutoCommit(true);//3,提交完成后回复现场将Auto commit,还原为true,




        }catch(Exception e){
            try {
                // 若出现异常，对数据库中所有已完成的操作全部撤销，则回滚到事务开始状态
                if(!conn.isClosed()){
                    conn.rollback();//4,当异常发生执行catch中SQLException时，记得要rollback(回滚)；
                    System.out.println("插入失败，回滚！");
                    conn.setAutoCommit(true);
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {
            if(null != rs4Cons){
                try {
                    rs4Cons.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(null != prestat){
                try {
                    prestat.close();
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
        long runTime = endTime - midTime;
        //88628ms
        //90296ms
        System.out.println("插入100w数据所花时间为："+runTime);
    }
}
