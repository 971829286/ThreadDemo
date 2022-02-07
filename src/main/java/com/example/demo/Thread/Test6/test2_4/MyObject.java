package com.example.demo.Thread.Test6.test2_4;

public class MyObject {
    private volatile static MyObject myObject;

    private MyObject(){}

    public static MyObject getInstance(){
        try{
            if (myObject ==null){
                //模拟在创建对象之前做一些准备性的工作
                Thread.sleep(3000);
                synchronized (MyObject.class){
                    if (myObject == null){
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return myObject;
    }
}
