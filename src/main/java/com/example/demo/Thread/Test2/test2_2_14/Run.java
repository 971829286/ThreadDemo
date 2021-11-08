package com.example.demo.Thread.Test2.test2_2_14;
import com.example.demo.Thread.Test2.test2_2_14.OutClass.Inner;
public class Run {
    public static void main(String[] args) {
        final Inner inner = new Inner();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        },"A");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        },"B");

        t1.start();
        t2.start();
    }
}
