package Ch_10;

// Пакет для использования класса Random:
import java.util.*;
public class TryCatchDemo{
    public static void main(String[] args){
        // Общее количество ошибок:
        int n=3;
        // Счетчик ошибок и счетчик циклов:
        int count=0,nums=0;
        // Случайные числа:
        int a,b;
        // Объект для генерирования случайных чисел:
        Random rnd=new Random();
        // Оператор цикла:
        while(count<n){
            // Изменение значения счетчика циклов:
            nums++;
            // Отслеживаемый на предмет ошибки код:
            try{
                // Целое случайное число от 0 до 9 включительно:
                a=rnd.nextInt(10);
                // Целое случайное число от 0 до 5 включительно:
                b=rnd.nextInt(6);
                // Вывод в консоль текстового сообщения:
                System.out.print(nums+") Результат деления нацело: "+a+"/"+b+" = ");
                // Попытка вычислить отношение.
                // Здесь возможна ошибка деления на ноль:
                System.out.println(a/b);
            }catch(ArithmeticException eObj){ // Обработка арифметической ошибки
                // При обработке ошибки в консоль выводится сообщение:
                System.out.println("бесконечность");
                // Использование объекта ошибки (исключения):
                System.out.println("Внимание! Произошла ошибка: "+eObj);
                // Изменение значения счетчика ошибок:
                count++;}
        }
        // Текстовое сообщение перед завершением работы программы:
        System.out.println("Количество ошибок: "+n+". Работа программы завершена!");}
}