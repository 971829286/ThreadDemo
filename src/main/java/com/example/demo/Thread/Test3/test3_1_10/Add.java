package com.example.demo.Thread.Test3.test3_1_10;



public class Add {
    private String lock;
    public Add(String lock){
        super();
        this.lock = lock;
    }
    public void add(){
        synchronized (lock){
            System.out.println("begin add");
            ValueObject.list.add("anyString");
            lock.notifyAll();
            System.out.println("end add");
        }
    }
}
