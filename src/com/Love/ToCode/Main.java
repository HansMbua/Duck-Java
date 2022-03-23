package com.Love.ToCode;

import java.time.Duration;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("**/ Red head Duck bellow **");
        Duck redheadDuck = new RedheadDuck();
        redheadDuck.performFly();
        redheadDuck.performQuack();

        System.out.println("**/ model duck bellow **");
        Duck modelDuck = new modelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        System.out.println("**/ decoy dock bellow **");
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.performQuack();
        decoyDuck.setQuackBehavior(new MuteQuack());
        decoyDuck.performQuack();


    }
}
