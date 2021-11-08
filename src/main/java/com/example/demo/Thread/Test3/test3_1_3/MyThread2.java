package com.example.demo.Thread.Test3.test3_1_3;

public class MyThread2 extends Thread{

    private Object lock;
    public MyThread2(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println("begin notify time:"+System.currentTimeMillis());
            lock.notify();
            System.out.println("end notify time:"+System.currentTimeMillis());
        }
    }
}
