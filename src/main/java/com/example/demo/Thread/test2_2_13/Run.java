package com.example.demo.Thread.test2_2_13;

public class Run {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername() +"/"+publicClass.getPassword());

        PublicClass.PrivateClass  privateClass = publicClass.new PrivateClass();
        privateClass.setAge("27");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge() +"/"+ privateClass.getAddress());
    }
}
