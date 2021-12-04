
package com.example.demo.Thread.Test4.test_1_2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Myservice {
    private Lock lock = new ReentrantLock();

    public void methodA(){
        try {
            lock.lock();
            System.out.println("methodA begin ThreadName="+Thread.currentThread().getName()+"time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodA end ThreadName="+Thread.currentThread().getName()+"time="+System.currentTimeMillis());

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
}