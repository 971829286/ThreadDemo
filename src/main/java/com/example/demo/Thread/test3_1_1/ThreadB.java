package com.example.demo.Thread.test3_1_1;

public class ThreadB extends Thread {

    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        try {
            System.out.println("============");
            while (true) {
                //TODO 为什么不加这个就不会输出
               // System.out.println(list.size());
                if (list.size() == 5) {
                    System.out.println("==5了，线程b要退出了");
                    throw new InterruptedException();

                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
