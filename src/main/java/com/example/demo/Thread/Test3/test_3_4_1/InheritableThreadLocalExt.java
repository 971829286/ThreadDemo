package com.example.demo.Thread.Test3.test_3_4_1;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {

    @Override
    protected Object initialValue(){
        return new Date().getTime();
    }
}
