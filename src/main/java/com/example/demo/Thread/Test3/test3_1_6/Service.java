package com.example.demo.Thread.Test3.test3_1_6;

public class Service {

    public void testMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin wait() ThreadName:"+Thread.currentThread().getName());
                lock.wait(5000);
                System.out.println("end wait() ThreadName:"+ Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
