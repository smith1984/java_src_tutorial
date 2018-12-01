package Ch_12;

// Импорт пакета для использования класса Scanner:
import java.util.*;
public class ScannerDemo{
    public static void main(String[] args){
// Объект класса Scanner:
        Scanner input=new Scanner(System.in);
// Текстовая переменная (имя):
        String name;
// Целочисленная переменная (возраст):
        int age;
// double-переменная (вес):
        double weight;
// Как Вас зовут?
        System.out.print("Как Вас зовут? ");
// Считывание полного имени пользователя:
        name=input.nextLine();
// Приветствие (с именем):
        System.out.println("Добрый день, "+name+"!");
// Сколько Вам лет?
        System.out.print("Сколько Вам лет? ");
// Считывание возраста:
        age=input.nextInt();
// Сообщение (с указанием возраста):
        System.out.println("Вам "+age+" лет!");
// Укажите вес (в кг):
        System.out.print("Укажите Ваш вес (в кг): ");
// Считывание веса:
        weight=input.nextDouble();
// Сообщение (с указанием веса):
        System.out.println("Ваш вес составляет "+weight+" кг.");
    }}
