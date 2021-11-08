package com.example.demo.Thread.Test3.test3_1_11_2;

public class Run {

    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C r = new C(lock);
        ThreadP[] pThread = new ThreadP[2];
        ThreadC[] cThread = new ThreadC[2];
        for (int  i =0 ;i <2 ;i++){
            pThread[i] = new ThreadP(p);
            pThread[i].setName("生产者"+(i+1));
            cThread[i] = new ThreadC(r);
            cThread[i].setName("消费者"+(i+1));
            pThread[i].start();
            cThread[i].start();
        }
    }
}
