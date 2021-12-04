package com.example.demo.Thread.Test3.test3_3_4;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue(){
        return new Date().getTime();
    }
}
