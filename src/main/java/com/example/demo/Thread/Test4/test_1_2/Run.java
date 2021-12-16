package com.example.demo.Thread.Test4.test_1_2;

public class Run {

    public static void main(String[] args) {
        Myservice service = new Myservice();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadAA aa = new ThreadAA(service);
        aa.setName("AA");
        aa.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadBB bb = new ThreadBB(service);
        bb.setName("BB");
        bb.start();
    }
}
