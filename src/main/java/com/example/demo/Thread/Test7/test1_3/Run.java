package com.example.demo.Thread.Test7.test1_3;

public class Run {
    //NEW
    //RUNNABLE
    //TERMINATED
    //BLOCKED
    //WAITING
    //TIME_WAITING
    public static void main(String[] args) throws InterruptedException {
        MyThread1  t1= new MyThread1();
        t1.setName("a");
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.setName("b");
        t2.start();
        Thread.sleep(1000);
        System.out.println("main 方法中的t2状态:"+t2.getState());
    }
}
