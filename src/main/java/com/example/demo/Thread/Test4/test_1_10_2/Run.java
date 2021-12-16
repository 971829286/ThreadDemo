package com.example.demo.Thread.Test4.test_1_10_2;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        final  Service service = new Service();
        Runnable runnable = service::serviceMethod1;
        Thread[] threadArray = new Thread[10];

        for (int i =0 ;i<10 ;i++){
            threadArray[i] = new Thread(runnable);
        }
        for (int i =0; i<10 ;i++){
            threadArray[i].start();
        }
        Thread.sleep(2000);
        System.out.println("有线程数:"+ service.lock.getQueueLength() +"在等待获取锁");
    }
}
