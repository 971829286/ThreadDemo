package com.example.demo.Thread.Test7.test6_2;

public class MyThread extends Thread {
    private String num;

    public MyThread(ThreadGroup group,String name,String num){
        super(group,name);
        this.num = num;
    }
    @Override
    public void run(){
        int numInt = Integer.parseInt(num);
        while (!interrupted()){
            System.out.println("死循环中："+Thread.currentThread().getName());
        }
    }
}
