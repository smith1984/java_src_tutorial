package Ch_1;

class FindRoot{
    public static void main(String args[]){
// Параметры уравнения:
        double a=5;
        double b=3;
        double c=1;
// Вспомогательная переменная:
        double alpha;
// Логическая переменная - критерий наличия решений:
        boolean state;
// Значение вспомогательной переменной:
        alpha=Math.asin(a/Math.sqrt(a*a+b*b));
// Вычисление критерия:
        state=a*a+b*b>=c*c;
// Вывод на экран значений исходных параметров:
        System.out.println("Уравнение a*cos(x)+b*sin(x)=c");
        System.out.println("Параметры:");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.print("Решение для x: ");
// Вычисление решения уравнения и вывод на экран:
        System.out.println(state?Math.asin(c/Math.sqrt(a*a+b*b))-alpha:"решений нет!");
    }}