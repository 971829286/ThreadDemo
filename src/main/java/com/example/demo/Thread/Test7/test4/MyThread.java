package com.example.demo.Thread.Test7.test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread  extends Thread{
    private SimpleDateFormat sdf;
    private String dateString;
    public MyThread(SimpleDateFormat sdf,String dateString){
        super();
        this.dateString =dateString;
        this.sdf =sdf;
    }

    @Override
    public void run(){
        try{
            Date deteRef = sdf.parse(dateString);
            String newDateString = sdf.format(deteRef);
            System.out.println("ThreadName="+ this.getName()+"========="+dateString+"转换为"+newDateString);
            if (!newDateString.equals(dateString)){
                System.out.println("ThreadName="+ this.getName()+"报错了 日期字符串"+dateString+"转换为"+newDateString);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
