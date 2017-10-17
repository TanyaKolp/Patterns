package play.com.srategy.duck.impl;

import play.com.srategy.behavior.impl.NonFlying;
import play.com.srategy.behavior.impl.Squeak;
import play.com.srategy.duck.Duck;

/**
 * Created by tanya on 16.10.17.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior= new NonFlying();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("model duck");
    }
}
