package play.com.duck;

import play.com.behavior.FlyBehavior;
import play.com.behavior.QuackBehavior;

/**
 * Created by tanya on 16.10.17.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
