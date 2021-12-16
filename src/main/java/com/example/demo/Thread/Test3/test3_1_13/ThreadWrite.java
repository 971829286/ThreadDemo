package com.example.demo.Thread.Test3.test3_1_13;

import java.io.PipedWriter;

public class ThreadWrite extends Thread{
    private WriteData write;

    private PipedWriter out;

    public ThreadWrite(WriteData write,PipedWriter out){
        super();
        this.write = write;
        this.out = out;
    }

    public void run(){
        write.writeMethod(out);
    }
}
