package decorator.starbuzz;

/**
 * Created by ito on 30.06.17.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double coast() {
        return 0.20 + beverage.coast();
    }
}
