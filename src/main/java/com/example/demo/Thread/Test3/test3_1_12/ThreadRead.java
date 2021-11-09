package com.example.demo.Thread.Test3.test3_1_12;

import java.io.PipedInputStream;

public class ThreadRead extends Thread{

    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read,PipedInputStream input){
        super();
        this.read = read;
        this.input = input;
    }

    @Override
    public void run(){
        read.readMethod(input);
    }
}
