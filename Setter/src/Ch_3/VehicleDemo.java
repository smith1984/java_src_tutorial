package Ch_3;

/**
 * Created by ito on 20.03.17.
 */
class Vehicle {
    int passengers;
    private int whelles;
    private int maxspeed;
    int burnup;

    Vehicle(){
        this(4, 4, 160, 13);
    }

    Vehicle(int passengers, int whelles, int maxspeed, int burnup){
        this.passengers = passengers;
        this.setWhelles(whelles);
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }

    double distance (double interval){
        double value = maxspeed*interval;
       return value;
    }

    double distance (int interval){
        return distance((double) interval);
    }

    public String toString(){
        return ("Vehicle (passengers = " + this.passengers + ";\nwhelles = " + this.whelles +
                "\nmaxspeed = " + this.maxspeed + "\nburnup = " + this.burnup);
    }

    public int getWhelles() {
        return this.whelles;
    }

    public void setWhelles(int whelles) {
        if ((whelles < 1) || (whelles > 24)){
            System.out.println("Неверное количество колес");
            return;
        }
        this.whelles = whelles;
    }

    public int getMaxspeed() {
        return this.maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }
}

class VehicleDemo{
    public static void main(String[] args){
        Vehicle car_1 = new Vehicle(2, 6, 150, 30);

        double distance = car_1.getMaxspeed()*0.5;
        System.out.println("За пол часа автомобиль сможет проехать с максимальной скоростью " + distance + " км.");
    }
}

interface Moveable{
    int GAP = 1;
    void move (int left, int top);
}
