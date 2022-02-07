package com.example.demo.Thread.Test7.test1_3;



public class MyThread2 extends Thread {
    @Override
    public void run(){
        MyService.serviceMethod();
    }
}
