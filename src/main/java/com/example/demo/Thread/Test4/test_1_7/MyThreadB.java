package com.example.demo.Thread.Test4.test_1_7;

public class MyThreadB extends Thread{

    private MyService myService;

    public MyThreadB(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run(){
        for (int i = 0;i<Integer.MAX_VALUE ; i++){
            myService.get();
        }
    }
}
