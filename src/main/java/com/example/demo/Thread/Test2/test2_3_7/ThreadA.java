package com.example.demo.Thread.Test2.test2_3_7;

public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run(){
        service.runMethod();
    }
}
