package com.example.demo.Thread.Test3.test3_2_3;

public class ThreadB extends Thread{

    @Override
    public void run(){
        try {
            ThreadA a =new ThreadA();
            a.start();
            a.join();
            System.out.println("线程B end");
        }catch (InterruptedException e){
            System.out.println("线程B catch");
            e.printStackTrace();
        }
    }
}
