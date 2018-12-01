package adapter.ducks;

/**
 * Created by ito on 12.07.17.
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble, gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
