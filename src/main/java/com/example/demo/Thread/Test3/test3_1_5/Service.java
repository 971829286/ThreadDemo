package com.example.demo.Thread.Test3.test3_1_5;

public class Service {

    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait()");

                    lock.wait();

                System.out.println("end wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("出现异常了,因为 wait状态的线程被interrupt ");
        }
    }

}
