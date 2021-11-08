package com.example.demo.Thread.Test3.test3_1_3_2;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    private static List list = new ArrayList();

    public static void add(){
        list.add("anyString");
    }
    public static int size(){
        return list.size();
    }
}
