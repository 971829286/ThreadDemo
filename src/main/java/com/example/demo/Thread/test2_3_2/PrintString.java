package com.example.demo.Thread.test2_3_2;

import com.example.demo.Thread.test2_3_1.Run;

public class PrintString implements Runnable{
    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    private  boolean isContinuePrint = true;



    public void printStringMethod(){
        try{
            while (isContinuePrint){
                System.out.println("run printStringMethod:"+ Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }
}
