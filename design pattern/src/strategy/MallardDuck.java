package strategy;

/**
 * Created by ito on 29.06.17.
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Я настоящая малдарская утка");
    }
}
