package Ch_5;

class Figures{
    // Количество вершин:
    private int n;
    // Точки (вершины):
    private Point[] points;
    // Конструктор класса:
    Figures(int n,double x,double y){
// Угол на начальную точку, угол приращения
// и расстояние до начальной точки:
        double phi0,phi,r;
// Начальная точка:
        Point p=new Point('A',x,y);
// Индексная переменная:
        int i;
// Значение для количества вершин:
        this.n=n;
// Массив переменных-ссылок на объекты "точек":
        points=new Point[n];
// Угол на начальную точку - вычисление:
        phi0=Math.atan2(y,x);
// Угол приращения - вычисление:
        phi=2*Math.PI/n;
// Расстояние до начальной точки от начала координат:
        r=p.dist();
        System.out.print("Правильный "+n+"-угольник с вершинами в точках ");
// Заполнение массива "точек" и вывод результата на экран:
        for(i=0;i<n-1;i++){
            p.show();
            System.out.print(i==n-2?" и ":", ");
            points[i]=p;
// "Вычисление" вершин:
            p=new Point((char)(p.name+1),r*Math.cos(phi0+(i+1)*phi),r*Math.sin(phi0+(i+1)*phi));
        }
// "Последняя" вершина:
        points[n-1]=p;
        p.show();
        System.out.println(".");
// Периметр фигуры:
        System.out.println("Периметр:\t"+perimeter()+".");
// Площадь фигуры:
        System.out.println("Площадь:\t"+square()+".");
    }
    // Расстояние между точками:
    double dist(Point A,Point B){
        return Math.sqrt((A.x-B.x)*(A.x-B.x)+(A.y-B.y)*(A.y-B.y));}
    // Метод для вычисления периметра:
    double perimeter(){
        double P=0;
        int i;
        for(i=0;i<n-1;i++)
            P+=dist(points[i],points[i+1]);
        P+=dist(points[n-1],points[0]);
        return P;
    }
    // Метод для вычисления площади:
    double square(){
        double r=points[0].dist();
        double phi=2*Math.PI/n;
        double s=r*r*Math.sin(phi)/2;
        return s*n;
    }
    // Внутренний класс для "точек":
    class Point{
        // Название вершины:
        char name;
        // Координаты вершины:
        double x,y;
        // Конструктор внутреннего класса:
        Point(char name,double x,double y){
            // Название точки:
            this.name=name;
            // Координаты точки:
            this.x=x;
            this.y=y;}
        // Метод для вычисления расстояния от начала координат до точки:
        double dist(){
            return Math.sqrt(x*x+y*y);}
        // Метод для отображения названия точки и ее координат:
        void show(){
            System.out.print(name+"("+Math.round(x*100)/100.0+","+Math.round(y*100)/100.0+")");}
    }
}
class FiguresDemo{
    public static void main(String[] args){
// Создание квадрата:
        new Figures(4,1,1);}
}