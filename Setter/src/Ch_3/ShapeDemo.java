package Ch_3;

/**
 * Created by ito on 20.03.17.
 */
public class ShapeDemo {
    public static void main (String[] args){
        Point p = new Point();
        Triangle t = new Triangle(3,4);
        Circle c = new Circle(5);

        Shape s [] = {p, t, c};
        System.out.println("Расчет площадей фигур");
        for(Shape x: s)
            System.out.println(x.toString() + " " + x.area());
    }
}

abstract class Shape{
    abstract double area();
}

class Point extends Shape{
    public String toString(){
        return "точка";
    }
    double area(){
        return 0;
    }
}

class Triangle extends Shape{
    int catetus1;
    int catetus2;

    Triangle (int catetus1, int catetus2){
        this.catetus2 = catetus2;
        this.catetus1 = catetus1;
    }
    public String toString(){
        return "треугольник";
    }
    double area(){
        return (catetus1*catetus2)/2;
    }
}

class Circle extends Shape{
    int radius;

    Circle (int radius){
        this.radius = radius;
    }
    public String toString(){
        return "круг";
    }
    double area(){
        return (Math.PI*radius*radius);
    }
}
