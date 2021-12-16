package com.example.demo.Thread.Test3.test3_1_14;

public class BackupA extends Thread{

    private  DBTools dbTools;

    public BackupA(DBTools dbTools){
        super();
        this.dbTools = dbTools;
    }

    public void run(){
        dbTools.backupA();
    }
}
