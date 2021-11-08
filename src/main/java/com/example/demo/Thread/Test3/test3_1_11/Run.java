package com.example.demo.Thread.Test3.test3_1_11;

public class Run {
    public static void main(String[] args) {
        String lock = "";
        P p = new P(lock);
        C c = new C(lock);
        ThreadP pThread = new ThreadP(p);
        ThreadC cThread = new ThreadC(c);
        pThread.start();
        cThread.start();
    }
}
