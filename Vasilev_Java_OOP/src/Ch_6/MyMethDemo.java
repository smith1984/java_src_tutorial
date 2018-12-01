package Ch_6;

class ClassA{
    static int count=0;
    private int code;
    int number;
    ClassA(int n){
        set(n);
        count++;
        code=count;
        System.out.println("Объект №"+code+" создан!");}
    void set(int n){
        number=n;}
    void show(){
        System.out.println("Для объекта №"+code+":");
        System.out.println("Поле number: "+number);}
}
class ClassB extends ClassA{
    char symbol;
    ClassB(int n,char s){
        super(n);
        symbol=s;}
    void set(int n,char s){
        number=n;
        symbol=s;}
    void show(){
        super.show();
        System.out.println("Поле symbol: "+symbol);}
}
class MyMethDemo{
    public static void main(String[] args){
        ClassA objA=new ClassA(10);
        ClassB objB=new ClassB(-20,'a');
        objA.show();
        objB.show();
        objB.set(100);
        objB.show();
        objB.set(0,'z');
        objB.show();}
}
