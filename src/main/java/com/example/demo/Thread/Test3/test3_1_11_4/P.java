package com.example.demo.Thread.Test3.test3_1_11_4;

public class P {
    private Mystack mystack;
    public P(Mystack mystack){
        super();
        this.mystack = mystack;
    }

    public void pushService(){
        mystack.push();
    }
}
