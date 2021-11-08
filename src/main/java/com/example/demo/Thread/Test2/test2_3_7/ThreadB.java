package com.example.demo.Thread.Test2.test2_3_7;

public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run(){
        service.stopMethod();
    }
}
