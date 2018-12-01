package Ch_2;

class UsingDoWhile{
    public static void main(String[] args){
        int sum=0,i=1;
// Инструкция цикла:
        do{
            sum+=i;
            i+=2;}while(i<=100);
        System.out.println("Сумма нечетных чисел от 1 до 100: "+sum);}
}