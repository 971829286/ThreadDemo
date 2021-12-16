package com.example.demo.Thread.Test3.test3_2_1;

public class Test {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        Long startTime = System.currentTimeMillis();



        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

// 放在要检测的代码段后，取结束后的时间戳
        Long endTime = System.currentTimeMillis();

// 计算并打印耗时
        Long tempTime = (endTime - startTime);
        System.out.println("花费时间："+
                (((tempTime/86400000)>0)?((tempTime/86400000)+"d"):"")+
                ((((tempTime/86400000)>0)||((tempTime%86400000/3600000)>0))?((tempTime%86400000/3600000)+"h"):(""))+
                ((((tempTime/3600000)>0)||((tempTime%3600000/60000)>0))?((tempTime%3600000/60000)+"m"):(""))+
                ((((tempTime/60000)>0)||((tempTime%60000/1000)>0))?((tempTime%60000/1000)+"s"):(""))+
                ((tempTime%1000)+"ms"));

        //Thread.sleep(?);
        System.out.println("我想当thread 对象执行完再执行");
        System.out.println("但是sleep()中的值该写多少呢");
        System.out.println("答案是不确定");
    }
}
