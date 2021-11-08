package com.example.demo.Thread.Test3.test3_1_11_2;

public class ThreadC extends Thread{

    private C r;
    public ThreadC(C r){
        super();
        this.r = r;
    }

    @Override
    public void run(){
        while (true){
            r.getValue();
        }
    }
}
