package Ch_2;

class UsingFor3{
    public static void main(String[] args){
        int sum,i;
// Инструкция цикла:
        for(sum=0,i=1;i<=100;sum+=i,i+=2);
        System.out.println("Сумма нечетных чисел от 1 до 100: "+sum);}
}
