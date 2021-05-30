package com.work;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Homework03_2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        long start=System.currentTimeMillis();
        //通过实现Callable接口实现
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
        new Thread(futureTask).start();
        Integer result = futureTask.get();
        System.out.println("异步计算结果为："+result);



        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");

        // 然后退出main线程
    }
}
