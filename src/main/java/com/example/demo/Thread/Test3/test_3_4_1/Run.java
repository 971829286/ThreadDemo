package com.example.demo.Thread.Test3.test_3_4_1;

public class Run {

    public static void main(String[] args) {
        try {
            for (int i = 0;i<10;i++){
                System.out.println("Main ："+Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
