package Ch_7;

// Интерфейс:
interface BaseA{
    int FunA(int n);
}
// Расширение интерфейса:
interface BaseB extends BaseA{
    int FunB(int n);
}
// Реализация интерфейса:
class MyClass_2 implements BaseB{
    public int FunA(int n){
        if(n<1) return 1;
        else return n*FunA(n-1);}
    public int FunB(int n){
        if(n==1||n==2) return n;
        else return n*FunB(n-2);}
}
class ImplExtDemo{
    public static void main(String args[]){
        MyClass_2 obj=new MyClass_2();
        System.out.println("1: "+obj.FunA(5));
        System.out.println("2: "+obj.FunB(5));}
}