package com.example.demo.Thread.Test3.test3_1_13;

import java.io.PipedReader;
import java.io.PipedWriter;

public class ThreadRead extends Thread{
    private ReadData read;

    private PipedReader input;

    public ThreadRead(ReadData read, PipedReader input){
        super();
        this.read = read;
        this.input = input;
    }

    public void run(){
        read.readMethod(input);
    }
}
