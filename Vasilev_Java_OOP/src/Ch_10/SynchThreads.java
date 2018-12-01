package Ch_10;

class MySource{
    // Синхронизированный метод:
    synchronized void showName(String msg1,String msg2,int time){
        try{
// Приостановка потока, из которого вызван метод:
            Thread.sleep(time);
// Вывод значения поля msg1:
            System.out.print(" Фамилия: "+msg1);
// Еще одна приостановка потока:
            Thread.sleep(2*time);
// Вывод значения поля msg2:
            System.out.println(" Имя: "+msg2);
        }catch(InterruptedException e){// Обработка исключения
            System.out.println("Прерывание потока: "+e);}
    }}
// Класс, реализующий интерфейс Runnable:
class MakeThread implements Runnable{
    // Поле объекта потока:
    Thread t;
    // Поле-объект MySource:
    MySource src;
    // Текстовы поля:
    String name;
    String surname;
    int time;
    // Конструктор:
    MakeThread(String s1,String s2,int time, MySource obj){
        surname=s1;
        name=s2;
        src=obj;
        this.time=time;
// Создание потока:
        t=new Thread(this);
// Запуск потока:
        t.start();}
    // Определение метода run():
    public void run(){
        src.showName(surname,name,time);}
}
class SynchThreads{
    public static void main(String args[]){
// Объект "ресурса":
        MySource obj=new MySource();
// Создание потоков:
        MakeThread fellow1=new MakeThread("Иванов","Иван",1000,obj);
        MakeThread fellow2=new MakeThread("Петров","Петр",450,obj);
        MakeThread fellow3=new MakeThread("Сидоров","Сидор",1450,obj);
        try{                      // Ожидать завершения потоков
            fellow1.t.join();
            fellow2.t.join();
            fellow3.t.join();
        }catch(InterruptedException e){ // Обработка исключения
            System.out.println("Прерывание потока: "+e);}
    }}