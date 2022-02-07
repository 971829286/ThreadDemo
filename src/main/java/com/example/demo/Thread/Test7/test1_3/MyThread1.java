package com.example.demo.Thread.Test7.test1_3;

public class MyThread1 extends Thread {
    @Override
    public void run(){
        MyService.serviceMethod();
    }
}
