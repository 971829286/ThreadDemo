package com.example.demo.Thread.Test4.test_1_7;

public class MyThreadA extends Thread{

    private MyService myService;

    public MyThreadA(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run(){
        for (int i=0; i< Integer.MAX_VALUE ; i++){
            myService.set();
        }
    }
}
