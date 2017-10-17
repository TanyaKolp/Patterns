package play.com.observerpattern.own.subjects;

import play.com.observerpattern.own.observers.Observer;

/**
 * Created by tanya on 17.10.17.
 */
public interface Subject {
    void notifyObservers();
    void registeObservers(Observer observer);
    void removeObservers(Observer observer);
}
