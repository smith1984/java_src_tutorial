package Ch_10;

class CurrentThreadDemo{
    public static void main(String args[]){
// Объектная переменная t класса Thread:
        Thread t;
// Объектная переменная t ссылается на главный поток программы:
        t=Thread.currentThread();
// Информация о потоке:
        System.out.println("Активный поток: "+t);
// Потоку присвоено (изменено) имя:
        t.setName("Самый главный поток");
// Информация о потоке:
        System.out.println("После изменения имени: "+t);
        try{
            for(int n=5;n>0;n--){
                System.out.println(n);
                // Приостановка потока:
                Thread.sleep(1000);}
        }catch(InterruptedException e){ // Обработка исключения "прерывание потока"
            System.out.println("Поток завершен!");}}
}