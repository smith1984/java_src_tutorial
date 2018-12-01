package strategy;

/**
 * Created by ito on 29.06.17.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Я не умею летать");
    }
}
