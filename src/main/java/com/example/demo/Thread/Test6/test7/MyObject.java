package com.example.demo.Thread.Test6.test7;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyObject {
    public enum MyEnumSingleton{
        connectionFactory;
        private Connection connection;

        private MyEnumSingleton(){
            try {
                System.out.println("调用了MyObject的构造");
                String url = "jdbc:sqlserver://localhost:1079;databaseName=y2";
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

    public static Connection getConnection(){
        return MyEnumSingleton.connectionFactory.getConnection();
    }

}
