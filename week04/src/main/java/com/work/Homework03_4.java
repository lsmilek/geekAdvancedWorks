package com.work;

import java.util.concurrent.CountDownLatch;

public class Homework03_4 {

    public static void main(String[] args) throws InterruptedException{
        long start=System.currentTimeMillis();


        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for(int i=0;i<5;i++) {
            new Thread(new MyCount(i,countDownLatch)).start();
        }
        countDownLatch.await();


        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");

        // 然后退出main线程
    }
    static class MyCount implements Runnable{
        private int id;
        private CountDownLatch latch;
        public MyCount(int id,CountDownLatch latch){
            this.id = id;
            this.latch = latch;
        }

        @Override
        public void run() {
            synchronized (this){
                System.out.println("id:"+id+","+Thread.currentThread().getName());
                System.out.println("线程组任务"+id+"异步计算结果为："+sum());
                System.out.println("线程组任务"+id+"结束，其他任务继续");
                latch.countDown();
            }

        }
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
