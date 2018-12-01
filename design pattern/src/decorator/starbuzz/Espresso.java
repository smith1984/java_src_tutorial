package decorator.starbuzz;

/**
 * Created by ito on 30.06.17.
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double coast() {
        return 1.99;
    }
}
