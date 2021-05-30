package com.work;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Homework03_3 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long start=System.currentTimeMillis();


        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
        CompletableFuture<Integer> future = new CompletableFuture<>();
        new Thread(new Runnable(){
            @Override
            public void run() {
                future.complete(sum());

            }
        }).start();

        int result = future.get();

        System.out.println("异步计算结果为："+result);
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
