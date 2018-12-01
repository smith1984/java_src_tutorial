package Ch_5;

class InterpAndApprox{
    // Размер массива:
    private int n;
    // Параметры регрессионной модели:
    private double a,b;
    // Массив данных:
    double[][] data;
    // Базовые функции в схеме Лагранжа:
    private double psi(int k,double x){
        int i;
        double s=1;
        for(i=0;i<k;i++)
            s*=(x-data[0][i])/(data[0][k]-data[0][i]);
        for(i=k+1;i<=n;i++)
            s*=(x-data[0][i])/(data[0][k]-data[0][i]);
        return s;}
    // Вычисление параметров регрессионной модели:
    private void setab(){
        double Sxy=0,Sx=0,Sy=0,Sxx=0;
        for(int i=0;i<=n;i++){
            Sx+=data[0][i];
            Sy+=data[1][i];
            Sxx+=data[0][i]*data[0][i];
            Sxy+=data[0][i]*data[1][i];}
        a=((n+1)*Sxy-Sx*Sy)/((n+1)*Sxx-Sx*Sx);
        b=Sy/(n+1)-a/(n+1)*Sx;
    }
    // Регрессионная функция:
    double approx(double x){
        return a*x+b;}
    // Интерполяционный полином:
    double interp(double x){
        double s=0;
        for(int i=0;i<=n;i++)
            s+=data[1][i]*psi(i,x);
        return s;}
    // Конструктор класса:
    InterpAndApprox(int n){
        this.n=n;
        data=new double[2][n+1];
        for(int i=0;i<=n;i++){
            data[0][i]=Math.PI*i/n/2;
            data[1][i]=Math.sin(data[0][i]);}
        setab();
    }}
class InterpAndApproxDemo{
    public static void main(String[] args){
        double x;
        int i,n=4,N=2*n;
        InterpAndApprox obj=new InterpAndApprox(n);
        System.out.printf("%60s","Таблица значений:\n");
        System.out.printf("%25s","Аргумент x");
        System.out.printf("%25s","Функция y=sin(x)");
        System.out.printf("%25s","Интерп. полином L(x)");
        System.out.printf("%25s","Регр. функция f(x)\n");
        for(i=0;i<=N;i++){
            x=i*Math.PI/N/2;
            System.out.printf("%25s",x);
            System.out.printf("%25s",Math.sin(x));
            System.out.printf("%25s",obj.interp(x));
            System.out.printf("%25s",obj.approx(x)+"\n");}
    }}
