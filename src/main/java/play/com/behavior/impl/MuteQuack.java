package play.com.behavior.impl;

import play.com.behavior.QuackBehavior;

/**
 * Created by tanya on 16.10.17.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
