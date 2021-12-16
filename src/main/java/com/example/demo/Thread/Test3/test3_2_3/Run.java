package com.example.demo.Thread.Test3.test3_2_3;

public class Run {

    public static void main(String[] args) {
        try{
            ThreadB b= new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c = new ThreadC(b);;
            c.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
