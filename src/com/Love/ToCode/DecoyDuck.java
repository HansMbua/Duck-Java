package com.Love.ToCode;

public class DecoyDuck extends Duck{

    public DecoyDuck(){
        flyBehavior = new flyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {

    }
}
