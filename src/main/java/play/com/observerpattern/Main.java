package play.com.observerpattern;

import play.com.observerpattern.own.observers.impl.CurrentConditionsDisplay;
import play.com.observerpattern.own.subjects.impl.WeatherStation;

/**
 * Created by tanya on 17.10.17.
 */
public class Main {
    public static void main(String[] args) {
        WeatherStation weth = new WeatherStation();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weth);
        weth.setMeasurements(10,20,22);
        weth.setMeasurements(10,20,22);
        weth.setMeasurements(10,20,22);
    }
}
