package com.example.demo.Thread.Test3.test3_1_10;

public class ThreadSubtract extends Thread {

    private Subtract s;

    public ThreadSubtract(Subtract s) {
        super();
        this.s = s;
    }

    @Override
    public void run() {
        s.subtract();
    }
}
