package com.example.demo.Thread.Test3.test3_1_6;

public class ThreadB extends Thread{

    private Object lock;

    public ThreadB(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run(){
        Service service = new Service();
        service.testMethod(lock);
    }
}
