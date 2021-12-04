package com.example.demo.Thread.Test4.test_1_1;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread a1 =new MyThread(service);

        MyThread a2 =new MyThread(service);
        MyThread a3 =new MyThread(service);
        MyThread a4 =new MyThread(service);
        MyThread a5 =new MyThread(service);
        a1.setName("a1");
        a2.setName("a2");
        a3.setName("a3");
        a4.setName("a4");
        a5.setName("a5");

        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }

}
