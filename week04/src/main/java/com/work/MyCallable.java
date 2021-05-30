package com.work;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    @Override
    public Integer call() throws Exception {
        return  Homework03_1.sum();
    }
}
