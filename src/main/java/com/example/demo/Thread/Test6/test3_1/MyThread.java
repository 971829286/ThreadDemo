package com.example.demo.Thread.Test6.test3_1;

public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println(MyObject.getInstance().hashCode());
    }
}
