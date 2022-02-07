package com.example.demo.Thread.Test6.test6;

import java.sql.Connection;
import java.sql.DriverManager;


public enum MyObject {
    connectionFactory;
    private Connection connection;

    private MyObject(){
        try {
            System.out.println("调用了MyObject的构造");
            String url = "jdbc:sqlserver://localhost:1079;databaseName=ghydb";
            String username="sa";
            String password ="";
            String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(driverName);
            connection = DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
