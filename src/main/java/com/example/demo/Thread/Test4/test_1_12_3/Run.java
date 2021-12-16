package com.example.demo.Thread.Test4.test_1_12_3;

public class Run {
    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = service1::serviceMethod;
        Thread  thread = new Thread(runnable);
        thread.start();
    }
}
