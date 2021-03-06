package Ch_2;

class MyEquation{
    public static void main(String args[]){
// Начальное приближение:
        double x0=0;
// Переменные для корня и функции:
        double x,f;
// Погрешность:
        double epsilon=1E-10;
// Ограничение на количество итераций:
        int Nmax=1000;
// Итерационная переменная:
        int n=0;
// Начальное значение для функции:
        f=x0;
        do{
// Изменение индексной переменной:
            n++;
// Новое приближение для корня:
            x=f;
// Новое значение для функции (корня):
            f=(x*x+10)/7;}
// Проверяемое условие:
        while((n<=Nmax)&&(Math.abs(x-f)>epsilon));
// "Последняя" итерация:
        x=f;
// Вывод результатов на экран:
        System.out.println("Решение уравнения:");
        System.out.println("x="+x);
        System.out.println("Количество итераций: "+(n+1));}
}