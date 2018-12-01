package Ch_3;

class FibonacciArray{
    public static void main(String args[]){
// Индексная переменная и размер массива:
        int k,n=20;
// Массив для чисел Фибоначчи:
        int[] Fib=new int[n];
// Первые два числа последовательности:
        Fib[0]=1;
        Fib[1]=1;
// Вывод первых двух значений на экран:
        System.out.print(Fib[0]+" "+Fib[1]);
// Вычисление последовательности и вывод на экран:
        for(k=2;k<n;k++){
// Элемент массива вычисляется на основе двух предыдущих:
            Fib[k]=Fib[k-1]+Fib[k-2];
// Вывод на экран:
            System.out.print(" "+Fib[k]);}}
}
