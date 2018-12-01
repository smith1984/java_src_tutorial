package Ch_2;

class FindPi{
    public static void main(String args[]){
// Количество базовых линий сетки:
        int N=100000;
// Индексные переменные:
        int i,j;
// Счетчик попавших в круг точек:
        long count=0;
// Координаты точек и число "пи":
        double x,y,Pi;
// Подсчет точек:
        for(i=0;i<=N;i++){
            for(j=0;j<=N;j++){
                x=(double)i/N;
                y=(double)j/N;
                if((x-0.5)*(x-0.5)+(y-0.5)*(y-0.5)<=0.25) count++;
            }
        }
// Число "пи":
        Pi=(double)4*count/(N+1)/(N+1);
// Вывод на экран результата:
        System.out.println("Вычисление значения по "+(long)(N+1)*(N+1)+" точкам:");
        System.out.println(Pi);}
}
