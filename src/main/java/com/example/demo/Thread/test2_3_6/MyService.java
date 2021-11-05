package com.example.demo.Thread.test2_3_6;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {
    public static AtomicLong aiRef = new AtomicLong();
    synchronized public void addNum(){
        System.out.println(Thread.currentThread().getName()+"加了100后的值是："+aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
