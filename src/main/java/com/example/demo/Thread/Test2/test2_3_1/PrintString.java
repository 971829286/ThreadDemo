package com.example.demo.Thread.Test2.test2_3_1;

public class PrintString {
    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    private volatile boolean isContinuePrint = true;



    public void printStringMethod(){
        try{
            while (isContinuePrint){
                System.out.println("run printStringMethod:"+ Thread.currentThread().getName());
                Thread.sleep(10000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
