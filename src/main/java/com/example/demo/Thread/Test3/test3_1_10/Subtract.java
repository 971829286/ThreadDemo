package com.example.demo.Thread.Test3.test3_1_10;

public class Subtract {

    private String lock;
    public Subtract(String lock){
        super();
        this.lock = lock;
    }

    public void subtract(){
        try{
            synchronized (lock){
                while (ValueObject.list.size() == 0){
                    System.out.println("wait begin ThreadName=" + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end ThreadName=" + Thread.currentThread().getName());
                }
                System.out.println("Error222");
                ValueObject.list.remove(0);
                System.out.println("list size:"+ValueObject.list.size());
            }
        }catch (Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
