package Ch_2;

/**
 * Created by ito on 17.03.17.
 */
public class CylinderVolume {
    public static void main (String[] args){
        double radius = 5;
        double height = 4;
        double volume = height*Math.PI*Math.pow(radius, 2);
        System.out.println("Объем цилиндра равен " + volume);
    }
}
