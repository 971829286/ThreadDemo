package com.example.demo.Thread.Test4.test_1_3;



public class run {
    public static void main(String[] args) {

        MyService myservice = new  MyService();
        ThreadA a =new ThreadA(myservice);
        a.start();
    }
}
