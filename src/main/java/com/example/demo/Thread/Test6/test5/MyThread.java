package com.example.demo.Thread.Test6.test5;

public class MyThread extends Thread {

    @Override
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(MyObject.getInstance().hashCode());
        }
    }
}
