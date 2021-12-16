package com.example.demo.Thread.Test4.test_1_12_3;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            System.out.println("查看此锁定是否有任意线程保持"+lock.isLocked());
            lock.lock();
            System.out.println("查看此锁定是否有任意线程保持"+lock.isLocked());
        }finally {
            lock.unlock();
        }
    }
}
