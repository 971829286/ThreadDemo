package com.example.demo.Thread.Test3.test3_1_11_4;

public class C {
    private Mystack mystack;
    public C(Mystack mystack){
        super();
        this.mystack = mystack;
    }
    public void popService(){
        System.out.println("pop=" + mystack.pop());
    }
}
