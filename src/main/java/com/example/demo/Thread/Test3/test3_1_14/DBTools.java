package com.example.demo.Thread.Test3.test3_1_14;

public class DBTools {
    volatile private boolean prevIsA = false;
    synchronized public void backupA(){
        try {
            while (prevIsA){
                wait();
            }
            for (int i =0; i< 5;i++){
                System.out.println("************");
            }
            prevIsA = true;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized  public void backupB(){
        try{
            while(!prevIsA){
                wait();
            }
            for (int i =0 ;i<5 ;i++){
                System.out.println("=============");
            }
            prevIsA = false;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
