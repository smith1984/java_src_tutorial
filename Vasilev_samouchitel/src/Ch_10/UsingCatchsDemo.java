package Ch_10;

// Подключение пакета:
import java.util.*;
public class UsingCatchsDemo{
    public static void main(String[] args){
// Объект для генерирования случайных чисел:
        Random rnd=new Random();
// Массив чисел:
        int[] array=new int[]{0,1,2,3,4,5,0,8,10,12,15};
// Числитель отношения и счетчик ошибок:
        int n=120,count=0;
// Оператор цикла:
        while(count<5){
// Отслеживаемый код:
            try{
// Возможна ошибка (деление на ноль и неверный индекс):
                System.out.print(n/array[rnd.nextInt(array.length+2)-1]+" ");}
// Обработка ошибки "деление на ноль":
            catch(ArithmeticException eObj){
                System.out.println("\nОшибка: деление на ноль! Описание: "+eObj);
                count++;}
// Обработка ошибки "неверный индекс":
            catch(ArrayIndexOutOfBoundsException eObj){
                System.out.println("\nОшибка: неверный индекс! Описание: "+eObj);
                count++;}
        }}
}
