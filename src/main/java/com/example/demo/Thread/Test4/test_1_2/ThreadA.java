package com.example.demo.Thread.Test4.test_1_2;

public class ThreadA extends Thread{


    private Myservice service;

    public ThreadA(Myservice service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.methodA();
    }
}
