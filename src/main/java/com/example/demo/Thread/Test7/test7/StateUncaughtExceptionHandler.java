package com.example.demo.Thread.Test7.test7;

public class StateUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {


    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("静态的异常处理");
        e.printStackTrace();
    }
}
