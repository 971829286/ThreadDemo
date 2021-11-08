package com.example.demo.Thread.Test3.test3_1_9;

public class MyRun {
    private String lock = new String("");

    private boolean isFirstRunB = false;
    private Runnable runnableA = () -> {

        try {
            synchronized (lock) {
                while (!isFirstRunB) {
                    System.out.println("begin wait");
                    lock.wait();
                    System.out.println("end wait");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    private Runnable runnableB = () -> {
        synchronized (lock) {
            System.out.println("begin notify");
            lock.notifyAll();
            System.out.println("end notify");
            isFirstRunB = true;
        }

    };

    public static void main(String[] args) throws InterruptedException {
        MyRun run = new MyRun();
        Thread a = new Thread(run.runnableA);
        a.start();

        Thread b = new Thread(run.runnableB);
        b.start();
        Thread.sleep(100);

    }
}
