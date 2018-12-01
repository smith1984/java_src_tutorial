package decorator.starbuzz;

/**
 * Created by ito on 30.06.17.
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "House Blend Cffee";
    }

    @Override
    public double coast() {
        return 0.89;
    }
}
