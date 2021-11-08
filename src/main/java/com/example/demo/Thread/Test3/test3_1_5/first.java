package com.example.demo.Thread.Test3.test3_1_5;


import java.util.stream.Stream;

public class first {
    public static void main(String[] args) {
        System.out.println(Stream.of("green","yellow","blue").
                max(String::compareTo).filter(s -> s.endsWith("n")));
    }

}
