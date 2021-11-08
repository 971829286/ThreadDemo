package com.example.demo.Thread.Test3.test3_1_4_1;

public class Service {


    public void testMethod(Object lock) throws InterruptedException {
        synchronized (lock){
            System.out.println("begin wait() ThreadName:"+Thread.currentThread().getName());
            lock.wait();
            System.out.println("end wait() ThreadName:"+Thread.currentThread().getName());
        }
    }

    public void synNotifyMethod(Object lock) throws InterruptedException {
        synchronized (lock){
            System.out.println("begin notify() ThreadName:"+Thread.currentThread().getName());
            lock.notify();
            Thread.sleep(5000);
            System.out.println("end notify() ThreadName:"+Thread.currentThread().getName());

        }
    }
}
