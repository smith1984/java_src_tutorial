package Ch_3;

import javax.swing.*;

/**
 * Created by ito on 20.03.17.
 */
public class ExtendsVehicleDemo {
    public static void main(String[] args){
        Auto bmw = new Auto(true);
        Vehicle v = new Vehicle(2, 2, 150, 15);
        bmw.sunroof = true;
        System.out.println(bmw.distance(1.5));
        System.out.println(bmw.getMaxspeed());
        System.out.println(bmw.sunroof);
        System.out.println("\n\n");
        System.out.println(v.toString());
        System.out.println(bmw.toString());

        if (bmw instanceof Moveable){
            Moveable m = bmw;
            m.move(10,40);
        }

    }
}

class Auto extends Vehicle implements Moveable{
    boolean sunroof;

    Auto(boolean sunroof){
        this(4, 4, 200, 12, sunroof);
    }
    Auto(int p, int w, int ms, int bu, boolean sr){
        super(p, w, ms, bu);
        this.sunroof = sr;
    }
    public String toString(){
        return ("Auto (passengers = " + this.passengers + ";\nwhelles = " + super.getWhelles() +
                "\nmaxspeed = " + super.getMaxspeed() + "\nburnup = " + this.burnup + "\nsunroof = " + this.sunroof);
    }
    public void move (int left, int top){
        System.out.println("Интерфейс");
    }
}
