package play.com.srategy.behavior.impl;

import play.com.srategy.behavior.FlyBehavior;

/**
 * Created by tanya on 16.10.17.
 */
public class NonFlying implements FlyBehavior{
    public void fly() {
        System.out.println("Can't fly");
    }
}
