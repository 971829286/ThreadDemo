package com.example.demo.Thread.Test7.test7;

public class Run3 {
    public static void main(String[] args) {
        MyThreadGroup group = new MyThreadGroup("我的线程组");
      //  myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        MyThread myThread = new MyThread(group,"我的线程");

        //MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler() );
        myThread.start();
    }
}
