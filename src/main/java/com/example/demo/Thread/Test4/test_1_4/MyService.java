package com.example.demo.Thread.Test4.test_1_4;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();

    public Condition condition = lock.newCondition();

    public void await() {
        try {
            lock.lock();
            System.out.println("wait 时间是" + System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signal() {
        try {
            lock.lock();
            System.out.println("signal 时间为" + System.currentTimeMillis());
        } finally {
            lock.unlock();
        }
    }

}
