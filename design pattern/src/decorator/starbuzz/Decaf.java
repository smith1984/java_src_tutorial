package decorator.starbuzz;

public class Decaf extends Beverage{

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double coast() {
        return 1.05;
    }
}
