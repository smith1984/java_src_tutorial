package strategy;

/**
 * Created by ito on 29.06.17.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Тишина>>");
    }
}
