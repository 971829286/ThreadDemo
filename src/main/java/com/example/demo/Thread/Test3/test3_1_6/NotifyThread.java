package com.example.demo.Thread.Test3.test3_1_6;

public class NotifyThread extends Thread{

    private Object lock;

    public NotifyThread(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run(){
        synchronized (lock){
            lock.notifyAll();

        }
    }
}
