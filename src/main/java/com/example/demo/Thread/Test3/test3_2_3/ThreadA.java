package com.example.demo.Thread.Test3.test3_2_3;

public class ThreadA extends Thread{

    public void run(){
        for (int i = 0;i<Integer.MAX_VALUE;i++){
            String  newString = new String();
            Math.random();
        }

    }
}
