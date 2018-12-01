package MyFirstProject;

/**
 * Created by ito on 09.03.17.
 */
public class JamesBondCar extends Car {
    public int drive(int howlong){
        int distance = howlong*180;
        System.out.println("Машина проехала " + distance + " км за " + howlong + " часов.");
        return distance;
    }
}
