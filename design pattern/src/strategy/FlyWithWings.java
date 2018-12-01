package strategy;

/**
 * Created by ito on 29.06.17.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("Я летаю!!!");
    }
}
