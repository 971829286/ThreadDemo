package com.example.demo.Thread.Test7.test6;

public class MyThread extends Thread {
    private String num;
    public MyThread(ThreadGroup group,String name,String num){
        super(group,name);
        this.num = num;
    }
    public void run(){
        int numInt = Integer.parseInt(num);
        Boolean flag=true;
        while (flag){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("死循环中:"+Thread.currentThread().getName());
            flag=false;
        }
    }
}
