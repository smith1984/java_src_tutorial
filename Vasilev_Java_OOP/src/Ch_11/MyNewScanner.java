package Ch_11;

// Импорт пакета:
import java.util.*;
class MyNewScanner{
    public static void main(String args[]){
// Объект класса Scanner создается на основе объекта System.in:
        Scanner inp=new Scanner(System.in);
// Текстовое поле (имя):
        String name;
// Числовое поле (возраст):
        int age;
// Задаем вопрос:
        System.out.println("Как Вас зовут?");
// Считываем текст (имя):
        name=inp.nextLine();
// Приветствие:
        System.out.println("Добрый день, "+name+"!");
// Задаем вопрос:
        System.out.println("Сколько Вам лет?");
// Считываем число (возраст):
        age=inp.nextInt();
// Вывод сообщения:
        System.out.println(name+", Вам "+age+" лет!");
    }}