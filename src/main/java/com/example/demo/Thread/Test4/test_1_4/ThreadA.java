package com.example.demo.Thread.Test4.test_1_4;



public class ThreadA extends Thread{

    private MyService service;

    public ThreadA(MyService myservice){
        super();
        this.service = myservice;
    }

    @Override
    public void run(){
        service.await();
    }
}
