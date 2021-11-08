package com.example.demo.Thread.Test3.test3_1_11_2;

import com.example.demo.Thread.Test3.test3_1_11.ValueObject;

public class P {
    private String lock;
    public P(String lock){
        super();
        this.lock = lock;
    }

    public void setValue(){

        try{
            synchronized (lock){
               while(!ValueObject.value.equals("")){
                   System.out.println("生产者" + Thread.currentThread().getName() +"Waiting 了 *");
                   lock.wait();
               }
                System.out.println("生产者" + Thread.currentThread().getName() + "Running了");
                ValueObject.value = System.currentTimeMillis() +"_"+System.nanoTime();
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
