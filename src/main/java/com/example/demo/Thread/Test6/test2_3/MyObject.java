package com.example.demo.Thread.Test6.test2_3;

public class MyObject {

    private static MyObject myObject;
    private MyObject(){
    }
    //设置同步方法效率太低了
    //整个方法被上锁。
    synchronized public static MyObject getInstance(){
        try{
            if (myObject==null){
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return  myObject;
    }
}
