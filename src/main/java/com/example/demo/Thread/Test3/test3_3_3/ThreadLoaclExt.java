package com.example.demo.Thread.Test3.test3_3_3;

public class ThreadLoaclExt extends ThreadLocal {

    @Override
    protected Object initialValue(){
        return "我是默认值，第一次get不再为null";
    }
}
