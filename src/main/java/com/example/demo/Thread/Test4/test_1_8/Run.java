package com.example.demo.Thread.Test4.test_1_8;

import com.example.demo.Thread.Test4.test_1_7.MyService;
import com.example.demo.Thread.Test4.test_1_7.MyThreadA;
import com.example.demo.Thread.Test4.test_1_7.MyThreadB;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA[] threadA = new MyThreadA[10];
        MyThreadB[] threadB = new MyThreadB[10];

        for (int i = 0; i<10;i++){
            threadA[i] = new MyThreadA(service);
            threadB[i] = new MyThreadB(service);
            threadA[i].start();
            threadB[i].start();
            System.out.println("到达："+i);
        }
    }
}
