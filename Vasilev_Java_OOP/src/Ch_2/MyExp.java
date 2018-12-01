package Ch_2;

class MyExp{
    public static void main(String args[]){
// Верхнняя граница ряда и индексная переменная:
        int N=100,k;
// Аргумент экспоненты, переменная для записи суммы
// и итерационная добавка:
        double x=1,s=0,q=1;
// Вычисление экспоненты:
        for(k=0;k<=N;k++){
            s+=q;
            q*=x/(k+1);}
// Вывод результата:
        System.out.println("exp("+x+")="+s);}
}
