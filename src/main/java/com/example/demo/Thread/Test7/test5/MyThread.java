package com.example.demo.Thread.Test7.test5;

public class MyThread extends Thread {

    @Override
    public void run(){
        String userName = null;
        System.out.println(userName.hashCode());
    }
}
