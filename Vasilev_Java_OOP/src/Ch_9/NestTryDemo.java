package Ch_9;

import java.util.Random;
class NestTryDemo{
    public static void main(String args[]){
        Random r=new Random();
        int a,b;
        int c[]={-1,1};
        for(int i=1;i<10;i++){
            try{
                a=r.nextInt(3);        // значение 0,1 или 2
                b=100/a;               // возможно деление на ноль
                System.out.println("b="+b);
                try{
                    if(a==1)
                        a=a/(a-1);    // деление на ноль
                    else c[a]=200;         // выход за границы массива
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Выход за границы массива: "+e);}
            }catch(ArithmeticException e){
                System.out.println("Деление на ноль: "+e);}
            System.out.println("*******************************");}
    }}
