package com.example.demo.Thread.test2_3_7;

public class Service {
    private boolean isContinueRun = true;

    public void runMethod(){
        String anyString = new String();
        while(isContinueRun){
            synchronized (anyString){

            }
        }
        System.out.println("停下来了！");
    }

    public void stopMethod(){
        isContinueRun = false;
    }
}
