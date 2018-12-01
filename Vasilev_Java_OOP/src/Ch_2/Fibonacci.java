package Ch_2;

class Fibonacci{
    public static void main(String args[]){
// Количество чисел последовательности и начальные члены:
        int N=15,a=1,b=1;
// Индексная переменная:
        int i;
        System.out.println("Числа Фибоначчи:");
// Вывод на экран двух первых членов последовательности:
        System.out.print(a+" "+b);
// Вычисление последовательности Фибоначчи:
        for(i=3;i<=N;i++){
            b=a+b;
            a=b-a;
            System.out.print(" "+b);}}
}