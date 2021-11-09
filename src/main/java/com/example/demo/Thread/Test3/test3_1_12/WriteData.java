package com.example.demo.Thread.Test3.test3_1_12;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.nio.charset.StandardCharsets;

public class WriteData {

    public void writeMethod(PipedOutputStream out) {
        try {
            System.out.println("write:");
            for (int i = 0; i < 20; i++) {
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println("");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
