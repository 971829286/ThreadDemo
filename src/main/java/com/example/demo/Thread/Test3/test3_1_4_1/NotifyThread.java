package com.example.demo.Thread.Test3.test3_1_4_1;

public class NotifyThread extends Thread{
    private Object lock;

    public NotifyThread(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run(){
        Service service = new Service();
        try {
            service.synNotifyMethod(lock);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
