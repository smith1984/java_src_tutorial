package Ch_2;

class UsingWhile{
    public static void main(String[] args){
        int sum=0,i=1;
// Инструкция цикла:
        while(i<=100){
            sum+=i;
            i+=2;}
        System.out.println("Сумма нечетных чисел от 1 до 100: "+sum);}
}