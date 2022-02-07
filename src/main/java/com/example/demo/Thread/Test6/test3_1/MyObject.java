package com.example.demo.Thread.Test6.test3_1;

public class MyObject {
    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }

    private MyObject(){
    }

    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
}
