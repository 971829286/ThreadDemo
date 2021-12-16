package com.example.demo.Thread.Test4.test_1_2;

public class ThreadBB extends Thread{


    private Myservice service;

    public ThreadBB(Myservice service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.methodB();
    }
}
