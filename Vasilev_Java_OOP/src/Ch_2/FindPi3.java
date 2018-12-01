package Ch_2;

class FindPi3{
    public static void main(String args[]){
// Количество множителей и индексная переменная:
        int N=20,k;
// Начальное значение и итерационный множитель:
        double Pi=2,q=Math.sqrt(2);
// Вычисление числа "пи":
        for(k=1;k<=N;k++){
            Pi*=2/q;
            q=Math.sqrt(2+q);}
// Вывод результата на экран:
        System.out.println("Вычисление по "+N+" множителям:");
        System.out.println(Pi);}
}