package play.com.observerpattern.builtin;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by tanya on 17.10.17.
 */
public class WeatherStation extends Observable {
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherStation() {

    }


    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temp = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
