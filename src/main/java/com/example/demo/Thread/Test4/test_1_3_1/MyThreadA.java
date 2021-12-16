package com.example.demo.Thread.Test4.test_1_3_1;

public class MyThreadA extends Thread{

    private MyService myService;

    public MyThreadA(MyService myService){

        super();
        this.myService = myService;
    }

    @Override
    public void run(){
        myService.waitMethod();
    }
}
