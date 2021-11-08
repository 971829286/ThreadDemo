package com.example.demo.Thread.Test2.test2_3_4;

public class MyThread extends Thread {
    volatile public static int count;
    synchronized private static void addCount(){
        for (int i =0;i< 100 ;i++){
            count++;
        }
        System.out.println("count="+count);
    }

    @Override
    public void run(){
        addCount();
    }
}
