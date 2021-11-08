package com.example.demo.Thread.Test2.test2_3_4;

public class Run {
    public static void main(String[] args) {
        MyThread[] myThread = new MyThread[100];
        for (int i = 0;i<100;i++ ){
            myThread[i] = new MyThread();
        }
        for (int i = 0;i<100 ;i++){
            myThread[i].start();
        }
    }

}
