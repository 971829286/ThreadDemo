package com.example.demo.Thread.Test3.test3_1_3_2;

public class ThreadA extends Thread{
    private Object lock;
    public ThreadA(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run(){
        synchronized (lock) {
            if (MyList.size() != 5){
                System.out.println("wait begin" + System.currentTimeMillis());
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait end" + System.currentTimeMillis());
            }
        }
    }
}
