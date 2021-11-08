package com.example.demo.Thread.Test2.test2_3_5;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run(){
        for (int i = 0;i<10000;i++){
            System.out.println(count.incrementAndGet());
        }
    }
}