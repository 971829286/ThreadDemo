package com.example.demo.Thread.Test3.test3_1_6;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        ThreadA a= new ThreadA(lock);
        a.start();
        ThreadB b= new ThreadB(lock);
        b.start();
        ThreadC c= new ThreadC(lock);
        c.start();
        Thread.sleep(5000);
//        NotifyThread notifyThread = new NotifyThread(lock);
//        notifyThread.start();
    }
}
