package com.example.demo.Thread.Test7.test1_1.join;

/**
* join的用法，哪个线程调用join哪个线程就插队先执行
*/
public class JoinTest {
/*
    结论：
            1、哪个线程调用join代表哪个线程要插在当前线程的前面执行。
              也就是说哪个线程执行这句代码，哪个线程就被阻塞。其他线程不受影响。
              比如把study.join();去掉，主线程会先执行完。
            2、join 源码还是调用的是wait方法进行等待。
              然后等线程执行完会调用notify，或者notifyAll 方法。
              所以使用join自己不要轻易调用wait，notify，notifyAll 方法。
*/

    public static void main(String[] args) {
        //开启学习线程
        Study study = new Study();
        study.setName("学习线程------");
        study.start();
        try {
            study.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +"-----学习完毕，准备干别的事");
    }


}


class Study extends Thread {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "我想学习study 多线程 join 用法，但是没有资料，开始百度找资料");
        Baidu baidu = new Baidu();
        baidu.setName("百度线程------");
        baidu.start();
        try {
            baidu.join(); //先去百度找资料，然后才能学习
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "开始学习");
    }
}


class Baidu extends Thread {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始百度，找资料中");
        for (int i = 1; i <= 2; i++) {
            System.out.println(Thread.currentThread().getName() + i + "秒");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "找到资料");
    }
}
