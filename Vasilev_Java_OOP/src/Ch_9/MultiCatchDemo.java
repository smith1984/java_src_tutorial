package Ch_9;

import java.util.Random;
class MultiCatchDemo{
    public static void main(String args[]){
        Random r=new Random();
        int MyArray[]={0,2};
        int a,b;
        for(int i=1;i<10;i++){
            try{
                a=r.nextInt(3);
                b=10/MyArray[a];
                System.out.println(b);
            }catch(ArithmeticException e){
                System.out.println("Деление на ноль!");}
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Выход за границы массива!");}
            finally{System.out.println("**************");}}
        System.out.println("Цикл for завершен!");}
}