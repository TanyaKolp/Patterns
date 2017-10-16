package play.com.duck.impl;

import play.com.behavior.impl.FlyWithWings;
import play.com.behavior.impl.Quack;
import play.com.duck.Duck;

/**
 * Created by tanya on 16.10.17.
 */
public class MDuck extends Duck {
    public MDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("It's MDuck");
    }
}
