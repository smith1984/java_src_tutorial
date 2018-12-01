package Ch_2;

class UsingFor4{
    public static void main(String[] args){
        int sum=0,i=1;
// инструкция цикла с пустыми блоками:
        for(;i<=100;){
            sum+=i;
            i+=2;}
        System.out.println("Сумма нечетных чисел от 1 до 100: "+sum);}
}
