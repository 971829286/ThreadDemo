package com.example.demo.Thread.Test2.test2_3_6;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread[] array = new MyThread[5];
        for (int i=0; i< array.length;i++){
            array[i] = new MyThread(service);
        }
        for (int i = 0; i<array.length ;i++){
            array[i].start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(service.aiRef.get());
    }
}
