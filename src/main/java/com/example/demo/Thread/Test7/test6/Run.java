package com.example.demo.Thread.Test7.test6;

public class Run {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("我的线程组");
        MyThread[] myThreads = new MyThread[10];
        for (int i=0;i<myThreads.length;i++){
            myThreads[i] = new MyThread(threadGroup,"线程"+(i+1),"1");
            myThreads[i].start();
        }
        MyThread newT = new MyThread(threadGroup,"报错线程","a");
        newT.start();
    }
}
