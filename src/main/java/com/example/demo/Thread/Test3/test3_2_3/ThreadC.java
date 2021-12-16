package com.example.demo.Thread.Test3.test3_2_3;

public class ThreadC extends Thread{

    private ThreadB threadB;

    public ThreadC(ThreadB threadB){
        super();
        this.threadB = threadB;
    }
    @Override
    public void run(){
        threadB.interrupt();
    }
}
