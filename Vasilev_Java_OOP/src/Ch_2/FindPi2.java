package Ch_2;

class FindPi2{
    public static void main(String args[]){
// Количество слагаемых и индексная переменная:
        int N=5000000,k;
// Начальное значение и добавка:
        double Pi=0,q=4;
// Вычисление числа "пи":
        for(k=0;k<=N;k++){
            Pi+=q/(2*k+1);
            q*=(-1);
        }
// Вывод результата на экран:
        System.out.println("Вычисление по "+N+" слагаемым ряда:");
        System.out.println(Pi);}
}