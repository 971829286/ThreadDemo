package com.example.demo.Thread.Test2.test2_2_16;


public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        Thread.sleep(50);
        b.start();
    }
}
