package play.com.observerpattern.own.observers.impl;

import play.com.observerpattern.own.observers.DisplayElement;
import play.com.observerpattern.own.observers.Observer;
import play.com.observerpattern.own.subjects.Subject;

/**
 * Created by tanya on 17.10.17.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registeObservers(this);
    }

    public void display() {

        System.out.println(String.format("State: T = %s, h = %s, P = %s", temp, humidity, pressure));
    }

    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        this.humidity = humidity;
        this.temp = temp;
        display();
    }
}
