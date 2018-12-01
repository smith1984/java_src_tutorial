package decorator.starbuzz;

/**
 * Created by ito on 30.06.17.
 */
public abstract class Beverage {
    String description = "Unknown beverange";

    public String getDescription() {
        return description;
    }

    public abstract double coast();
}
