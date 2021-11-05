package com.example.demo.Thread.test2_2_16;

public class MyService {
    private String lock = "123";
    public void testMethod(){

        synchronized (lock){
            System.out.println(Thread.currentThread().getName()+"->in"+System.currentTimeMillis());

            lock = "456";
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"->out"+System.currentTimeMillis());

        }
    }
}
