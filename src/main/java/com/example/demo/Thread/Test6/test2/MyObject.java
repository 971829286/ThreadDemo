package com.example.demo.Thread.Test6.test2;

public class MyObject {

    private static MyObject myObject;
    private MyObject(){
    }

    public static MyObject getInstance(){
        if (myObject == null){
            myObject = new MyObject();
        }
        return myObject;
    }
}
