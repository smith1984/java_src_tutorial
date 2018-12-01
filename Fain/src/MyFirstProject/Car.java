package MyFirstProject;

/**
 * Created by ito on 09.03.17.
 */
public class Car {
    public void start(){
        System.out.println("Машина завелась");
    }

    public void stop(){
        System.out.println("Двигатель заглушен");
    }

    public int drive(int howlong){
        int distance = howlong*60;
        System.out.println("Машина проехала " + distance + " км за " + howlong + " часов.");
        return distance;
    }

}
