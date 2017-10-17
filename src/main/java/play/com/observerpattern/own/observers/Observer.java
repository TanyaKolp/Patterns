package play.com.observerpattern.own.observers;

/**
 * Created by tanya on 17.10.17.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
