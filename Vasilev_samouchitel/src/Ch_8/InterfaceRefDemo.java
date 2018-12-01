package Ch_8;

// Интерфейс:
interface Base4{
    // Метод объявлен в интерфейсе:
    void show();}
// Класс реализует интерфейс:
class A3 implements Base4{
    // Описание метода интерфейса:
    public void show(){
        System.out.println("Это метод класса A!");}
}
// Этот класс также реализует интерфейс:
class B3 implements Base4{
    // Описание метода интерфейса:
    public void show(){
        System.out.println("Это метод класса B!");}
}
public class InterfaceRefDemo {
    public static void main(String[] args){
// Интерфейсная переменная:
        Base4 ref;
// Ссылка на объект первого класса:
        ref=new A3();
// Вызов метода через интерфейсную переменную:
        ref.show();
// Ссылка на объект второго класса:
        ref=new B3();
// Вызов того же метода через интерфейсную переменную:
        ref.show();}
}
