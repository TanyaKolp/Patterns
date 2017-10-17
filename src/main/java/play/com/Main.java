package play.com;

import play.com.srategy.behavior.impl.FlyWithWings;
import play.com.srategy.duck.Duck;
import play.com.srategy.duck.impl.MDuck;
import play.com.srategy.duck.impl.ModelDuck;

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
