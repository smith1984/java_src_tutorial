package Ch_3;

/**
 * Created by ito on 20.03.17.
 */
public class MoreVehicleDemo {
    public static void main(String[] args){

        Vehicle car_1 = new Vehicle(2, 6, 150, 30);
        Vehicle bus_1 = new Vehicle(45, 4, 130, 45);

        double interval = 1.25;
        double distanceCar = car_1.getMaxspeed()*interval;
        double distanceBus = bus_1.getMaxspeed()*interval;
        System.out.println("Car_1 за 1 час 15 минут сможет проехать расстояние " + distanceCar + " км.");
        System.out.println("Bus_1 за 1 час 15 минут сможет проехать расстояние " + distanceBus + " км.");

        double time = 0.5;

        System.out.print("Автомобиль с " + car_1.passengers + " пассажирами ");
        System.out.println("пойдет путь, равный " + car_1.distance(time)+" км.");
        System.out.print("Автобус с " + bus_1.passengers + " пассажирами ");
        System.out.println("пойдет путь, равный " + bus_1.distance(time) +" км.");

        Vehicle ferrari = new Vehicle(2, -2, 360, 12);
        System.out.println("Максимальная скорость - " + ferrari.getMaxspeed() + " км/ч");
        System.out.println("Количество колес - " + ferrari.getWhelles() + " шт");
        ferrari.setWhelles(4);
        System.out.println("Количество колес - " + ferrari.getWhelles() + " шт");

        Vehicle moskvich = new Vehicle();

    }
}
