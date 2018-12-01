package decorator.starbuzz;

/**
 * Created by ito on 30.06.17.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description ="Dark Roast Coffee";
    }

    @Override
    public double coast() {
        return 0.99;
    }
}
