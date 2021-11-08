package com.example.demo.Thread.Test3.test3_1_4_1;

public class Test {

    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a= new ThreadA(lock);
        a.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
        synNotifyMethodThread c = new synNotifyMethodThread(lock);
        c.start();
    }
}
