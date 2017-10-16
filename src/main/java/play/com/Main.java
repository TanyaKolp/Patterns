package play.com;

import play.com.behavior.impl.FlyWithWings;
import play.com.duck.Duck;
import play.com.duck.impl.MDuck;
import play.com.duck.impl.ModelDuck;

/**
 * Created by tanya on 16.10.17.
 */
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
    }
}
