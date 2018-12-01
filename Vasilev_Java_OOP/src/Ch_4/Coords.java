package Ch_4;

class Coords{
    // Координаты точки:
    double x;
    double y;
    double z;
    // Метод для присваивания значений полям:
    void set(double a,double b,double c){
        x=a;
        y=b;
        z=c;
    }
    // Методом вычисляется расстояние до точки:
    double getDistance(){
        return Math.sqrt(x*x+y*y+z*z);}
}
class CoordsDemo{
    public static void main(String[] args){
// Создание объекта:
        Coords obj=new Coords();
// Вызов метода:
        obj.set(5.0,0,2.5);
// Обращение к полю объекта:
        obj.y=-4.3;
// Обращение к методу объекта:
        System.out.println("Расстояние до точки: "+obj.getDistance());
    }
}