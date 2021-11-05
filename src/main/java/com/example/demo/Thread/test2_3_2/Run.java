package com.example.demo.Thread.test2_3_2;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        //Thread.sleep(1000);
        System.out.println("Stop it! stopThread =" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
