package com.example.demo.Thread.Test3.test3_1_11_4;


public class PThread extends Thread {
    private P p;
    public PThread(P p){
        super();
        this.p = p;
    }

    @Override
    public void run(){
        while (true){
            p.pushService();
        }
    }
}
