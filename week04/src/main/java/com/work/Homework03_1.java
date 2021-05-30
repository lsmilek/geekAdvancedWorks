package com.work;

/**
        * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
        * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
        * 写出你的方法，越多越好，提交到github。
        *
        * 通过Thread.jion() 阻塞主线程
        */
public class Homework03_1 {

    public static void main(String[] args) throws InterruptedException {
        long start=System.currentTimeMillis();


        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
        //方法一：用Thread.join()
       /* Thread thread = new Thread(){
            @Override
            public void run() {
                int result = sum(); //这是得到的返回值
                System.out.println("异步计算结果为："+result);
            }
        };*/
        //实现Runnable接口
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                    int result = sum(); //这是得到的返回值
                    System.out.println("异步计算结果为："+result);
                }
        });
        thread.start();
       // thread.join();//通过阻塞
        Thread.sleep(1000);//通过线程睡眠




        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");

        // 然后退出main线程
    }

    public static int sum() {
        return fibo(36);
    }

    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
}
