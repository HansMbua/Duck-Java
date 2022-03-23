package com.Love.ToCode;

public  class MallardDuck extends Duck{


  public MallardDuck(){
      quackBehavior = new Quack();
      flyBehavior = new fly();

  }


    @Override
    public void display() {

    }
}
