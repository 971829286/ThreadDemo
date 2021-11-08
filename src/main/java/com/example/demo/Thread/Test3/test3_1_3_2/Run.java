package com.example.demo.Thread.Test3.test3_1_3_2;

public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadB b =new ThreadB(lock);
        b.start();
    }
}
