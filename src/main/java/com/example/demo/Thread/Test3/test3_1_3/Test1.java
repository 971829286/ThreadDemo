package com.example.demo.Thread.Test3.test3_1_3;

public class Test1 {
    public static void main(String[] args) {
        String newString = new String("");
        try {
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
