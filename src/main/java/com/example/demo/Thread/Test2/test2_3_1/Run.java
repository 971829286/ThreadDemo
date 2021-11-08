package com.example.demo.Thread.Test2.test2_3_1;

public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        printString.printStringMethod();
        System.out.println("我要停止它！"+Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
