package com.example.demo.Thread.Test3.test3_1_11_4;

public class Run {

    public static void main(String[] args) {
        Mystack mystack = new Mystack();
        P p1 = new P(mystack);
        P p2 = new P(mystack);
        P p3 = new P(mystack);
        P p4 = new P(mystack);
        P p5 = new P(mystack);
        C r1 = new C(mystack);
        C r2 = new C(mystack);
        C r3 = new C(mystack);
        C r4 = new C(mystack);
        PThread p1Thread = new PThread(p1);
        PThread p2Thread = new PThread(p2);
        PThread p3Thread = new PThread(p3);
        PThread p4Thread = new PThread(p4);
        PThread p5Thread = new PThread(p5);
        CThread c1Thread = new CThread(r1);
        CThread c2Thread = new CThread(r2);
        CThread c3Thread = new CThread(r3);
        CThread c4Thread = new CThread(r4);

        p1Thread.start();
        p2Thread.start();
        p3Thread.start();
        p4Thread.start();
        p5Thread.start();
        c1Thread.start();
        c2Thread.start();
        c3Thread.start();
        c4Thread.start();
    }
}
