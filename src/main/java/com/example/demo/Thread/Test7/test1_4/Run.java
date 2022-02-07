package com.example.demo.Thread.Test7.test1_4;

public class Run {
    //NEW
    //RUNNABLE
    //TERMINATED
    //BLOCKED
    //WAITING
    //TIME_WAITING
    public static void main(String[] args) {
        try{
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的t的状态:"+t.getState());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
