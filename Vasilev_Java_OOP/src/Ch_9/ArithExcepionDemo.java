package Ch_9;

// Импорт класса Random:
import java.util.Random;
class ArithExcepionDemo{
    public static void main(String args[]){
        int a=0,b=0,c=0;
// Объект для генерирования случайных чисел:
        Random r=new Random();
        for(int i=0;i<32000;i++){
            try{
                b=r.nextInt(200);
                c=r.nextInt(100);
// Возможно деление на ноль:
                a=10000/b/c;
            }catch(ArithmeticException e){
// Обработка ошибки:
                System.out.println("Деление на ноль!");
                a=0;}
            System.out.println("a="+a);}
    }
}
