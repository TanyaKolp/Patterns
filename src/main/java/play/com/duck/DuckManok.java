package play.com.duck;

import play.com.behavior.QuackBehavior;
import play.com.behavior.impl.Quack;

/**
 * Created by tanya on 16.10.17.
 */
public class DuckManok {
    QuackBehavior quackBehavior;

    public DuckManok() {
        quackBehavior = new Quack();
    }
    private void display(){
        System.out.println("svistok");
    }

}
