package com.example.demo.Thread.test2_2_10;

public class Run {

    public static void main(String[] args){
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
