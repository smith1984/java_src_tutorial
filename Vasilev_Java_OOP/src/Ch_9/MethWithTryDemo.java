package Ch_9;

import java.util.Random;
class MethWithTryDemo{
    static void nesttry(int a){
        int c[]={-1,1};
        try{
            if(a==1) a=a/(a-1); // деление на ноль
            else c[a]=200;      // выход за границы массива
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за границы массива: "+e);}
    }
    public static void main(String args[]){
        Random r=new Random();
        int a,b;
        for(int i=1;i<10;i++){
            try{
                a=r.nextInt(3);     // значения 0, 1 или 2
                b=100/a;            // возможно деление на ноль
                System.out.println("b="+b);
                nesttry(a);
            }catch(ArithmeticException e){
                System.out.println("Деление на ноль: "+e);}
            System.out.println("*******************************");}
    }}
