package com.Love.ToCode;

public class modelDuck extends Duck{


    public modelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new flyNoWay();
    }

    @Override
    public void display() {
        System.out.println(" i am a new model dock ");
    }
}
