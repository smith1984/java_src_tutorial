package Ch_10;

// Импорт класса Date:
import java.util.Date;
// Класс NewThread наследует класс Thread:
class NewThread_3 extends Thread{
    // Параметры потока (название, время задержки, количество итераций):
    private String name;
    private int time;
    private int count;
    // Конструктор:
    NewThread_3(String name,int time,int count){
        super(name);
        this.name=name;
        System.out.print("Создан новый поток: "+name+". ");
// Отображение даты и времени:
        System.out.println("Время: "+new Date()+".");
        this.time=time;
        this.count=count;
// Запуск потока:
        start();}
    // Переопределение метода run():
    public void run(){
        try{
            for(int i=1;i<=count;i++){
                System.out.print("Поток: "+name+". Сообщение "+i+" из "+count+". ");
// Отображение даты и времени:
                System.out.println("Время: "+new Date()+".");
// Приостановка потока:
                Thread.sleep(time);}
        }catch(InterruptedException e){
            System.out.println("Прерывание потока"+name);}
        finally{
            System.out.print("Поток \""+name+"\" работу завершил! ");
// Отображение даты и времени:
            System.out.println("Время: "+new Date()+".");}
    }}
class MultiThreadDemo{
    // Исключение InterruptedException в методе main() не обрабатывается:
    public static void main(String args[]) throws InterruptedException{
        System.out.print("Начало работы! ");
// Отображение даты и времени:
        System.out.println("Время: "+new Date()+".");
// Создание трех дочерних потоков:
        new NewThread_3("Красный",5000,5);
        new NewThread_3("Желтый",6000,4);
        new NewThread_3("Зеленый",7000,3);
// Приостановка главного потока:
        Thread.sleep(30000);
        System.out.print("Работа программы завершена! ");
// Отображение даты и времени:
        System.out.println("Время: "+new Date()+".");
    }}