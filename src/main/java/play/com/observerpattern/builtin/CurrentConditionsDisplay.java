package play.com.observerpattern.builtin;

import play.com.observerpattern.own.observers.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by tanya on 17.10.17.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temp;
    private float humidity;
    private float pressure;

      public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {

        System.out.println(String.format("State: T = %s, h = %s, P = %s", temp, humidity, pressure));
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherStation) {
            WeatherStation weatherData = (WeatherStation) o ;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity ();
            display();
        }
    }
}
