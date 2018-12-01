package Ch_3;

class Polynom{
    public static void main(String args[]){
// Коэффициенты полинома:
        double[] a=new double[]{1,-3,2,4,1,-1};
// Массив коэффициентов производной:
        double[] b=new double[a.length-1];
// Аргумент и множитель:
        double x=2.0,q=1;
// Индексная переменная:
        int k;
// Значения полинома и производной:
        double P=0,Q=0;
// Вычисление результата:
        for(k=0;k<b.length;k++){
// Полином:
            P+=a[k]*q;
// Коэффициент производной:
            b[k]=(k+1)*a[k+1];
// Производная:
            Q+=b[k]*q;
// Изменение множителя:
            q*=x;}
// Последнее слагаемое полинома:
        P+=a[a.length-1]*q;
// Вывод результата:
        System.out.println("Полином P(x)="+P);
        System.out.println("Производная P'(x)="+Q);}
}