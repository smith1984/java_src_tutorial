package Ch_10;

// Класс, расширяющий интерфейс Runnable:
class NewThread implements Runnable{
    // Поле - ссылка на объект потока:
    Thread t;
    // Конструктор класса:
    NewThread(){
// Создание объекта потока:
        t=new Thread(this,"Новый поток");
// Вывод сведений о потоке:
        System.out.println("Дочерний поток: "+t);
        t.start();        // Запуск потока
    }
    // Определение метода run():
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Дочерний поток: "+i);
// Приостановка потока:
                Thread.sleep(500);}
        }
// Обработка исключительной ситуации прерывания потока
        catch(InterruptedException e){
            System.out.println("Прерывание дочернего потока!");}
        System.out.println("Завершение дочернего потока!");
    }
}
class ThreadDemo{
    public static void main(String args[]){
// Создание анонимного объекта класса NewThread:
        new NewThread();     // Создание нового потока
        try{
            for(int i=5;i>0;i--){
                System.out.println("Главный поток: "+i*100);
// Приостановка главного потока:
                Thread.sleep(1000);}
        }
// Обработка исключительной ситуации прерывания главного потока:
        catch(InterruptedException e){
            System.out.println("Прерывание главного потока!");}
        System.out.println("Завершение главного потока!");}
}