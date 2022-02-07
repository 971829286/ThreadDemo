package com.example.demo.Thread.Test6.test2_3;



public class MyThread extends Thread {

    @Override
    public void run(){
        System.out.println(MyObject.getInstance().hashCode());
    }
}
