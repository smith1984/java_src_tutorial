package Ch_2;

class UsingIf3{
    public static void main(String[] args){
        int a=0;
// Если a равно 0:
        if(a==0){System.out.println("Нулевое значение переменной!");}
// Если a равно 1:
        else if(a==1){System.out.println("Единичное значение переменной!");}
// Если a – четное (остаток от деления на 2 равен 0):
        else if(a%2==0){System.out.println("Четное значение переменной!");}
// В прочих случаях:
        else {System.out.println("Нечетное значение переменной!");}
        System.out.println("Программа завершила работу!");
    }
}
