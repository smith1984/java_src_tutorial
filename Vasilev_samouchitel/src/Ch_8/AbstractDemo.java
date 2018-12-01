package Ch_8;
// Абстрактный класс:
abstract class Base3{
    // Текстовое поле:
    String operation;
    // Конструктор:
    Base3(String str){
        operation=str;}
    // Абстрактный метод:
    abstract int F(int n);
    // Обычный метод (с вызовом абстрактного):
    void show(int n){
        System.out.println("Операция: "+operation);
        System.out.println("Аргумент: "+n);
        System.out.println("Значение: "+F(n));}
}
// Подкласс абстрактного суперкласса:
class BaseA extends Base3{
    // Конструктор подкласса:
    BaseA(){
// Вызов конструктора (абстрактного) суперкласса:
        super("факториал");}
    // Переопределение абстрактного метода:
    int F(int n){
        if(n==1) return 1;
        else return n*F(n-1);}
}
// Еще один подкласс абстрактного суперкласса:
class BaseB extends Base3{
    // Вызов конструктора (абстрактного) суперкласса:
    BaseB(){
// Вызов конструктора (абстрактного) суперкласса:
        super("двойной факториал");}
    // Переопределение абстрактного метода:
    int F(int n){
        if(n==1||n==2) return n;
        else return n*F(n-2);}
}
public class AbstractDemo {
    public static void main(String[] args){
// Создание объекта первого подкласса:
        BaseA A=new BaseA();
// Создание объекта второго подкласса:
        BaseB B=new BaseB();
// Вызов метода из первого подкласса:
        A.show(5);
// Вызов метода из второго подкласса:
        B.show(5);}
}
