package com.example.demo.Thread.Test3.test3_1_3;

public class MyThread1 extends Thread{

    private Object lock;
    public MyThread1(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println("begin waite time:"+System.currentTimeMillis());
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end waite time:"+System.currentTimeMillis());
        }
    }
}
