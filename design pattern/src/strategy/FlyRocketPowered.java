package strategy;

/**
 * Created by ito on 29.06.17.
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Я реактивно летающая утка");
    }
}
