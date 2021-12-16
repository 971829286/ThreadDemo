package com.example.demo.Thread.Test4.test_1_10_3;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service =new Service();
        Runnable runnable = service::waitMethod;
        Thread[] threads = new Thread[10];
        for (int i=0;i<10;i++){
            threads[i] = new Thread(runnable);
        }
        for (int i=0 ;i<10 ;i++){
            threads[i].start();
        }
        Thread.sleep(2000);
        service.notityMethod();
    }
}
