package play.com.observerpattern.own.subjects.impl;

import play.com.observerpattern.own.observers.Observer;
import play.com.observerpattern.own.subjects.Subject;

import java.util.ArrayList;

/**
 * Created by tanya on 17.10.17.
 */
public class WeatherStation implements Subject {
    private ArrayList<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        this.observers = new ArrayList<Observer>();
    }

    public void notifyObservers() {
        observers.forEach(o ->
                o.update(temp, humidity, pressure));
    }

    public void registeObservers(Observer observer) {
        observers.add(observer);
    }

    public void removeObservers(Observer observer) {
        observers.remove(observer);
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temp = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
