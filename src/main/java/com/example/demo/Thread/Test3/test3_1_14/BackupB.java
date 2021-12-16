package com.example.demo.Thread.Test3.test3_1_14;

public class BackupB extends Thread{

    private  DBTools dbTools;

    public BackupB(DBTools dbTools){
        super();
        this.dbTools = dbTools;
    }

    public void run(){
        dbTools.backupB();
    }
}
