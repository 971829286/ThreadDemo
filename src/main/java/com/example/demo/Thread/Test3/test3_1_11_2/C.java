package com.example.demo.Thread.Test3.test3_1_11_2;

public class C {
    private String lock;

    public C(String lock){
        super();
        this.lock = lock;
    }

    public void getValue(){
        try{
            synchronized (lock){
                while (ValueObject.value.equals("")){
                   System.out.println("消费者"+Thread.currentThread().getName()+"WAITING 了+*+");
                   lock.wait();
                }
                System.out.println("消费者"+Thread.currentThread().getName()+"Runnable 了");
                ValueObject.value = "";
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
