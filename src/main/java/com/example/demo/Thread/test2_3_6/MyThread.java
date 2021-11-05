package com.example.demo.Thread.test2_3_6;

public class MyThread extends Thread {
    private MyService service;
    public MyThread(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.addNum();
    }
}
