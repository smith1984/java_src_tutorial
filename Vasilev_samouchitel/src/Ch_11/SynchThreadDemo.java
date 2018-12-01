package Ch_11;

// Подключение пакета (для генерирования случайных чисел):
import java.util.*;
// Класс для создания объекта - общего ресурса для потоков:
class MyClass{
    // Поле класса:
    private int count;
    // Конструктор класса:
    MyClass(){
        count=0;}
    // Метод для присваивания значения полю:
    void set(int count,String name){
        this.count=count;
        System.out.println(name+"Установлено значение поля "+count+": "+new Date());}
    // Метод для считывания значения поля:
    int get(String name){
        System.out.println(name+"Считано значение поля "+count+": "+new Date());
        return count;}
}
// Класс для создания потоков:
class MyThread3 extends Thread{
    // Поле - тип потока:
    private boolean UpDown;
    // Поле - имя потока:
    private String name;
    // Объект - ресурс для потока:
    private MyClass obj;
    // Переопределение метода run():
    public void run(){
// Объект для генерирования случайных чисел:
        Random rnd=new Random();
// Локальная переменная:
        int number;
        for(int i=1;i<=3;i++){
// Синхронизация потоков при обращении к ресурсу:
synchronized(obj){
            try{
// Считывание поля:
                number=obj.get(name);
// Изменение значения поля:
                if(UpDown) number++;
                else number--;
// Задержка в выполнении метода:
                sleep(1000+rnd.nextInt(9000));
// Изменение значения поля:
                obj.set(number,name);}
// Обработка исключения:
            catch(InterruptedException e){
                System.out.println(e);}
}
        }}
    // Конструктор класса:
    MyThread3(boolean UpDown,MyClass obj){
        this.UpDown=UpDown;
        if(UpDown) name="Up-поток. ";
        else name="Down-поток. ";
        this.obj=obj;
// Запуск потока:
        start();}
}
public class SynchThreadDemo{
    public static void main(String[] args) throws InterruptedException{
// Объект - ресурс:
        MyClass obj=new MyClass();
// Поток, увеличивающий значение поля:
        MyThread3 thA=new MyThread3(true,obj);
// Поток, уменьшающий значение поля:
        MyThread3 thB=new MyThread3(false,obj);
// Главный поток будет ожидать окончания первого потока:
        thA.join();
// Главный поток будет ожидать окончания второго потока:
        thB.join();
// Окончание главного потока:
        System.out.print("Окончательно: ");
        obj.get("");}
}
