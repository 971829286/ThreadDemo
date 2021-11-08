package com.example.demo.Thread.Test3.test3_1_11;

public class ThreadP extends Thread{

    private P p;
    public ThreadP(P p){
        super();
        this.p = p;
    }

    @Override
    public void run(){
        while (true)
            p.setValue();
    }
}
