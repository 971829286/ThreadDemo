package com.example.demo.Thread.Test3.test3_1_11_4;

public class CThread extends Thread{
    private C r;

    public CThread(C r){
        super();
        this.r =r ;
    }

    public void run(){
        while (true){
            r.popService();
        }
    }
}
