package com.example.demo.Thread.Test6.test1;

public class MyThread extends Thread {

    @Override
    public void run(){
        System.out.println(MyObject.getInstance().hashCode());
    }
}
