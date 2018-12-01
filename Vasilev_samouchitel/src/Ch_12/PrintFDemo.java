package Ch_12;

import java.util.*;
public class PrintFDemo{
    public static void main(String[] args){
        String text="Текстовая строка";
        double x=100.0/7.0;
        double z=130;
        int n=-1234567;
        int k=7654321;
        int m=0xABC;
        int l=0123;
        Date now=new Date();
        System.out.printf("%s\t%d\t%f\n",text,k,z);
        System.out.printf("Десятичные числа:\n%1$g\t%2$e\t%1$07.2f\n",x,z);
        System.out.printf("Отрицательное число: %,(d\n",n);
        System.out.printf("Положительное число: %+,d\n",k);
        System.out.printf("16-е значение %x соответствует 10-му числу %<d\n",m);
        System.out.printf("10-е значение %d соответствует 16-му числу %<X\n",k);
        System.out.printf("8-е значение %o соответствует 10-му числу %<d\n",l);
        System.out.printf("Месяц: %tB\n",now);
        System.out.printf("Число: %te\n",now);
        System.out.printf("День недели: %tA\n",now);
        System.out.printf("Время: %tT\n",now);}
}
