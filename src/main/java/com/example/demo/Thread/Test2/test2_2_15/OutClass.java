package com.example.demo.Thread.Test2.test2_2_15;

public class OutClass {
    static class InnerClass1 {
        public void method1(InnerClass2 class2){
            String threadName = Thread.currentThread().getName();
            synchronized (class2) {
                System.out.println(threadName + "InnerClass1->method1->in");
                for (int i = 1;i <= 10; i++){
                    System.out.println("i"+":"+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(threadName + "InnerClass1->method1->out");
            }
        }

        public synchronized  void method2(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "InnerClass1->method2->in");
            for (int j= 0; j <= 10; j++){
                System.out.println("j=" + j);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(threadName + "InnerClass1->method2->out");
        }
    }


    static class InnerClass2 {
        public synchronized  void method1(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "InnerClass2->method1->in");
            for (int k= 0; k <= 10; k++){
                System.out.println("k=" + k);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(threadName + "InnerClass2->method1->out");
        }
    }
}
