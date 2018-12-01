package observer.weather;

/**
 * Created by ito on 29.06.17.
 */
public interface Observer {
    public void update (float temp, float humidity, float pressure);
}
