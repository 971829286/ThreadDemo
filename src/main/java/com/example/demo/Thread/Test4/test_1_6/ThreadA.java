package com.example.demo.Thread.Test4.test_1_6;

public class ThreadA extends Thread{

    private MyService service;

    public ThreadA(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.awaitA();
    }
}
