package strategy;

/**
 * Created by ito on 29.06.17.
 */
public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Я утка приманка");
    }
}
