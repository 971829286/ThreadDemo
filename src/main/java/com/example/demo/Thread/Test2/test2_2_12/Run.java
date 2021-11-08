package com.example.demo.Thread.Test2.test2_2_12;

public class Run {

    public static void main(String[] args) {
        DealThread t1 = new DealThread();
        t1.setFlag("a");

        Thread thread1 = new Thread(t1);
        thread1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.setFlag("b");
        Thread thread2 = new Thread(t1);
        thread2.start();
    }
}
