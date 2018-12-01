package Ch_7;

// Интерфейс:
interface MyMath{
    // Сигнатура метода:
    double Sinus(double x);
    // Константа:
    double PI=3.14159265358979;
}
// Класс реализует интерфейс:
class MyClass implements MyMath{
    // Реализация метода (вычисление синуса):
    public double Sinus(double x){
        int i,n=1000;
        double z=0,q=x;
        for(i=1;i<=n;i++){
            z+=q;
            q*=(-1)*x*x/(2*i)/(2*i+1);}
        return z;}
}
class MyMathDemo{
    public static void main(String args[]){
        MyClass obj=new MyClass();
// Использование константы:
        double z=MyClass.PI/6;
// Вызов метода:
        System.out.println("sin("+z+")="+obj.Sinus(z));}
}