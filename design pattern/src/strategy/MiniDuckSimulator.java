package strategy;

/**
 * Created by ito on 29.06.17.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        mallard.swim();

        Duck modelduck = new ModelDuck();
        modelduck.performFly();
        modelduck.setFlyBehavior(new FlyRocketPowered());
        modelduck.performFly();
    }
}
