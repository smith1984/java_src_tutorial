package Ch_11;

public class MainThreadDemo{
    // Главный метод может выбрасывать исключение InterruptedException:
    public static void main(String[] args) throws InterruptedException{
// Объектная переменная для записи ссылки на главный поток:
        Thread t;
// Время (в миллисекундах) задержки в выполнении потока:
        long time=2500;
// Получение ссылки на объект главного потока:
        t=Thread.currentThread();
// Вывод сведений о потоке в консольное окно:
        System.out.println(t);
// Изменение имени потока:
        t.setName("Это самый главный поток!");
// Считывание приоритета потока:
        int p=t.getPriority();
// Изменение приоритета потока:
        t.setPriority(++p);
// Вывод сведений о потоке в консольное окно:
        System.out.println(t);
// Текстовое сообщение о приостановке выполнения потока:
        System.out.println("Выполнение потока приостановлено на "+(double)time/1000+" секунд.");
// Приостановка выполнения потока:
        Thread.sleep(time);
// Завершение работы программы:
        System.out.println("Работа программы завершена!");}
}
