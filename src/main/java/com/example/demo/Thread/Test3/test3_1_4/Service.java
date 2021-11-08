package com.example.demo.Thread.Test3.test3_1_4;

public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait()");
                Thread.sleep(1000);
                System.out.println("end wait");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
