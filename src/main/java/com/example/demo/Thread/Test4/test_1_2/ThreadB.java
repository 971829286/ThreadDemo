package com.example.demo.Thread.Test4.test_1_2;

public class ThreadB extends Thread{


    private Myservice service;

    public ThreadB(Myservice service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.methodB();
    }
}
