package Ch_8;

// Интерфейс:
interface Mathematica{
    // Поле-константа:
    int TEN=10;
    // Объявление методов:
    int factorial(int n);
    double power(double x,int n);
}
// Класс реализует интерфейс:
class MyMath implements Mathematica{
    // Описание метода интерфейса (факториал):
    public int factorial(int n){
        int s=1,i;
        for(i=n;i>0;s*=i--);
        return s;}
    // Описание метода интерфейса (возведение в степень):
    public double power(double x,int n){
        double s=1;
        for(int i=1;i<=n;s*=x,i++);
        return s;}
    // Метод для отображения результатов вызова методов:
    void show(double x,int n){
        System.out.println("Первый аргумент: "+x);
        System.out.println("Второй аргумент: "+n);
        System.out.println("Факториал: "+factorial(n));
        System.out.println("Возведение в степень: "+power(x,TEN));}
}
public class UsingInterfaceDemo {
    public static void main(String[] args){
// Создание объекта класса:
        MyMath obj=new MyMath();
// Переменные для передачи аргументами.
// Определяются через статическое поле-константу:
        int n=Mathematica.TEN/3;
        double x=(double)MyMath.TEN/n-n;
// Вызов метода show():
        obj.show(x,n);}
}