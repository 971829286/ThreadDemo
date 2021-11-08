package com.example.demo.Thread.Test3.test3_1_3_2;

public class ThreadB extends Thread{
    private Object lock;
    public ThreadB(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run(){
        synchronized (lock) {
            for (int i =0 ;i <10 ;i++){
                MyList.add();
                if (MyList.size()==5){
                    lock.notify();
                    System.out.println("已经发送通知");
                }
                System.out.println("添加了"+(i+1)+"个元素");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}