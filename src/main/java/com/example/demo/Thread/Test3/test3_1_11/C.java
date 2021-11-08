package com.example.demo.Thread.Test3.test3_1_11;

public class C {

    private String lock ;
    public C(String lock){
        super();
        this.lock = lock;
    }

    public void getValue(){
        try {
            synchronized (lock){
                if (ValueObject.value.equals("")){
                    lock.wait();
                }

                System.out.println("get的值:"+ ValueObject.value);
                ValueObject.value ="";
                lock.notify();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
