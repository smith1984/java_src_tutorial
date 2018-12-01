package Ch_2;

class UsingFor5{
    public static void main(String[] args){
        int sum=0,i=1;
// Инструкция цикла со всеми пустыми блоками:
        for(;;){
            sum+=i;
            i+=2;
// Выход из инструкции цикла:
            if(i>100) break;}
        System.out.println("Сумма нечетных чисел от 1 до 100: "+sum);}
}