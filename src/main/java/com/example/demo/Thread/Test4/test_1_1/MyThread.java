package com.example.demo.Thread.Test4.test_1_1;

public class MyThread extends Thread{

    private MyService service;

    public MyThread(MyService service){
        super();
        this.service = service;
    }
    @Override
    public void run(){
        service.testMethod();
    }
}