package com.example.demo.Thread.Test5.test1_2;

import java.util.Date;
import java.util.TimerTask;

public class Run {
    static public class MyTask extends TimerTask{
        @Override
        public void run(){
            System.out.println("运行了!时间为:"+new Date());
        }
    }
}
