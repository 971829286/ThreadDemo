package com.example.demo.Thread.test2_2_10;

public class ThreadB extends Thread{
    public Service service;

    public ThreadB(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run(){
        Service.print("AA");
    }
}
