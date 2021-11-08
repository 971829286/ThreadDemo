package com.example.demo.Thread.Test3.test3_1_11_4;

import com.example.demo.Thread.Test3.test3_1_11_2.ThreadC;

import java.util.ArrayList;
import java.util.List;

public class Mystack {
    volatile  private List list = new ArrayList();
    synchronized public void push(){
      try {
          while (list.size() == 1) {
              this.wait();
          }
          list.add("anyString=" + Math.random());
          this.notifyAll();
          System.out.println("push="+list.size());
      }catch (Exception e) {
          e.printStackTrace();
      }
    }

    synchronized public String pop(){
        String returnValue = "";
        try {
            while (list.size() == 0){
                System.out.println("pop操作中的:"+ Thread.currentThread().getName());
                this.wait();
            }
            System.out.println("list.size():"+list.size());
            returnValue = "" + list.get(0);
            list.remove(0);
            this.notifyAll();
            System.out.println("pop="+list.size());
        }catch (Exception e){
            e.printStackTrace();
        }
        return returnValue;
    }
}
