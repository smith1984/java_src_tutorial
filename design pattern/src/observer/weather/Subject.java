package observer.weather;

/**
 * Created by ito on 29.06.17.
 */
public interface Subject {
    public void registerObserver (Observer o);
    public void removeObserver (Observer o);
    public void notifyObserver();

}
