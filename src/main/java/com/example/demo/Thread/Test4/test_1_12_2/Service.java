package com.example.demo.Thread.Test4.test_1_12_2;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

    private ReentrantLock lock;

    public Service(boolean isFair){
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            System.out.println("查看当前线程是否保持锁定："+lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println("查看当前线程是否保持锁定："+lock.isHeldByCurrentThread());
        }finally {
            lock.unlock();
        }
    }
}
