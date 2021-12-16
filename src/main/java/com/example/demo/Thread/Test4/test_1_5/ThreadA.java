package com.example.demo.Thread.Test4.test_1_5;

import com.example.demo.Thread.Test4.test_1_2.Myservice;

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
