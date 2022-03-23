package com.Love.ToCode;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("muted quck");
    }
}
