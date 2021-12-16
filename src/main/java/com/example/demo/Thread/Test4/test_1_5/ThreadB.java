package com.example.demo.Thread.Test4.test_1_5;

public class ThreadB extends Thread{

    private MyService service;

    public ThreadB(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.awaitB();
    }
}
