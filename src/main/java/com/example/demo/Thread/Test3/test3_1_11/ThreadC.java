package com.example.demo.Thread.Test3.test3_1_11;

public class ThreadC extends Thread{

    private C c;
    public ThreadC(C c){
        super();
        this.c = c;
    }

    @Override
    public void run(){
        while (true)
            c.getValue();
    }
}
