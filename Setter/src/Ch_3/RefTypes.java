package Ch_3;

/**
 * Created by ito on 20.03.17.
 */
public class RefTypes {
    public static void main (String [] args ){
        Vehicle car1, car2;
        car1 = new Vehicle(2, 6, 150, 30);
        car2 = car1;
        System.out.println("Количества пассажиров в car_2 - " + car2.passengers);
    }
}
