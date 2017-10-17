package play.com.srategy.duck.impl;

import play.com.srategy.behavior.impl.FlyWithWings;
import play.com.srategy.behavior.impl.Quack;
import play.com.srategy.duck.Duck;

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
