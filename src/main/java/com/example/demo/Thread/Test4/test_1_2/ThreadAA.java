package com.example.demo.Thread.Test4.test_1_2;

public class ThreadAA extends Thread{


    private Myservice service;

    public ThreadAA(Myservice service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.methodA();
    }
}
