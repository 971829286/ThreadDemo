package com.example.demo.Thread.Test3.test3_3_4;

public class ThreadA extends Thread {

    @Override
    public void run(){
        try {
            for (int i =0;i<10;i++){
                System.out.println("ThreadA 线程中取值："+Tools.t1.get());
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
