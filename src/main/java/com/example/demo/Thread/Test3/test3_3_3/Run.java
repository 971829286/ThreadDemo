package com.example.demo.Thread.Test3.test3_3_3;

public class Run {
    public static ThreadLoaclExt t1 = new ThreadLoaclExt();

    public static void main(String[] args) {
        if (t1.get() == null){
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());

    }
}
