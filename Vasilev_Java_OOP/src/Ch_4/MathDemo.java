package Ch_4;

// Класс с математическими функциями:
class MyMath{
    // Интервал разложения в ряд Фурье:
    static double L=Math.PI;
    // Экспонента:
    static double Exp(double x,int N){
        int i;
        double s=0,q=1;
        for(i=0;i<N;i++){
            s+=q;
            q*=x/(i+1);}
        return s+q;}
    // Синус:
    static double Sin(double x,int N){
        int i;
        double s=0,q=x;
        for(i=0;i<N;i++){
            s+=q;
            q*=(-1)*x*x/(2*i+2)/(2*i+3);}
        return s+q;}
    // Косинус:
    static double Cos(double x,int N){
        int i;
        double s=0,q=1;
        for(i=0;i<N;i++){
            s+=q;
            q*=(-1)*x*x/(2*i+1)/(2*i+2);}
        return s+q;}
    // Функция Бесселя:
    static double BesselJ(double x,int N){
        int i;
        double s=0,q=1;
        for(i=0;i<N;i++){
            s+=q;
            q*=(-1)*x*x/4/(i+1)/(i+1);}
        return s+q;}
    // Ряд Фурье по синусам:
    static double FourSin(double x,double[] a){
        int i,N=a.length;
        double s=0;
        for(i=0;i<N;i++){
            s+=a[i]*Math.sin(Math.PI*x*(i+1)/L);}
        return s;}
    // Ряд Фурье по косинусам:
    static double FourCos(double x,double[] a){
        int i,N=a.length;
        double s=0;
        for(i=0;i<N;i++){
            s+=a[i]*Math.cos(Math.PI*x*i/L);}
        return s;}
}
class MathDemo{
    public static void main(String args[]){
        System.out.println("Примеры вызова функций:");
// Вычисление экспоненты:
        System.out.println("exp(1)="+MyMath.Exp(1,30));
// Вычисление синуса:
        System.out.println("sin(pi)="+MyMath.Sin(Math.PI,100));
// Вычисление косинуса:
        System.out.println("cos(pi/2)="+MyMath.Cos(Math.PI/2,100));
// Вычисление функции Бесселя:
        System.out.println("J0(mu1)="+MyMath.BesselJ(2.404825558,100));
// Заполнение массивов коэффициентов рядов Фурье для функции y(x)=x:
        int m=1000;
        double[] a=new double[m];
        double[] b=new double[m+1];
        b[0]=MyMath.L/2;
        for(int i=1;i<=m;i++){
            a[i-1]=(2*(i%2)-1)*2*MyMath.L/Math.PI/i;
            b[i]=-4*(i%2)*MyMath.L/Math.pow(Math.PI*i,2);}
// Вычисление функции y(x)=x через синус-ряд Фурье:
        System.out.println("2.0->"+MyMath.FourSin(2.0,a));
// Вычисление функции y(x)=x через косинус-ряд Фурье:
        System.out.println("2.0->"+MyMath.FourCos(2.0,b));
    }}