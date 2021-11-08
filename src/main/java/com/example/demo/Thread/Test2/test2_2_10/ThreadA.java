package com.example.demo.Thread.Test2.test2_2_10;

public class ThreadA extends Thread{
    public Service service;

    public ThreadA(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run(){
        Service.print("AA");
    }
}
