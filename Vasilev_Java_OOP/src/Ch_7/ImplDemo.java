package Ch_7;

// Интерфейс:
interface Base{
    int F(int n);
}
// Класс A реализует интерфейс Base:
class A implements Base{
    // Двойной факториал числа:
    public  int F(int n){
        if(n==1||n==2) return n;
        else return n*F(n-2);}
}
// Класс B реализует интерфейс Base:
class B implements Base{
    // Факториал числа:
    public int F(int n){
        if(n<1) return 1;
        else return n*F(n-1);}
}
class ImplDemo{
    public static void main(String args[]){
// Интерфейсные переменные и создание объектов:
        Base refA=new A();
        Base refB=new B();
// Объектные переменные и создание объектов:
        A objA=new A();
        B objB=new B();
// Проверка работы методов:
        System.out.println("1: "+refA.F(5));
        System.out.println("2: "+refB.F(5));
        System.out.println("3: "+objA.F(5));
        System.out.println("4: "+objB.F(5));
// Изменение интерфейсных ссылок:
        refA=objB;
        refB=objA;
// Проверка результата:
        System.out.println("5: "+refA.F(5));
        System.out.println("6: "+refB.F(5));}
}