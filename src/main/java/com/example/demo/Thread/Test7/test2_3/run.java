package com.example.demo.Thread.Test7.test2_3;

public class run {
    public static void main(String[] args) {
        System.out.println("A处线程:"+Thread.currentThread().getName()+"所属的线程组名为:"+
                Thread.currentThread().getThreadGroup().getName()+"中有线程组数量:"+Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup group = new ThreadGroup("新的组");
        System.out.println("B处线程:"+Thread.currentThread().getName()+"所属的线程组名为:"+
                Thread.currentThread().getThreadGroup().getName()+"中有线程组数量:"+Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup[] threadGroups = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadGroups);
        for (int i=0;i<threadGroups.length;i++){
            System.out.println("第一个线程组名称为:"+threadGroups[i].getName());
        }
    }
}
