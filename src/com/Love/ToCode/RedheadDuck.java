package com.Love.ToCode;

public class RedheadDuck extends Duck {

    public RedheadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new flyNoWay();
    }

    @Override
    public void display() {
        System.out.println("am a Red head duck and i cannot fly");
    }
}
