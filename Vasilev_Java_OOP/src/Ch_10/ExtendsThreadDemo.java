package Ch_10;

// Класс NewThread расширяет класс Thread:
class NewThread_2 extends Thread{
    // Конструктор класса:
    NewThread_2(){
// Вызов конструктора класса Thread:
        super("Новый поток");
// Вывод сведений о потоке:
        System.out.println("Дочерний поток: "+this);
// Запуск потока на выполнение:
        start();
    }
    // Переопределение метода run():
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Дочерний поток: "+i);
// Приостановка потока:
                Thread.sleep(500);}
        }
// Обработка исключения прерывания потока:
        catch(InterruptedException e){
            System.out.println("Прерывание дочернего потока!");}
        System.out.println("Завершение дочернего потока!");}
}
class ExtendsThreadDemo{
    public static void main(String args[]){
        new NewThread_2();
        try{
            for(int i=5;i>0;i--){
                System.out.println("Главный поток: "+i*100);
                Thread.sleep(1000);}
        }catch(InterruptedException e){
            System.out.println("Прерывание главного потока!");}
        System.out.println("Завершение главного потока!");
    }}