package Ch_3;

/**
 * Created by ito on 20.03.17.
 */
public class PoliVehicleDemo {
    public static void main(String[] args){
        Auto a = new Auto(true);
        Vehicle v = new Vehicle();
        Vehicle pvd[] = {a, v};
        for (Vehicle x: pvd) {
            System.out.println(x);
        }

    }
}
