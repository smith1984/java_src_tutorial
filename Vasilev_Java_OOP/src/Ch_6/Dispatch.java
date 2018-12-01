package Ch_6;

class A_5{
    void show(){
        System.out.println("Класс А");}
}
class B_5 extends A_5{
    void show(){
        System.out.println("Класс В");}
}
class C_5 extends A_5{
    void show(){
        System.out.println("Класс C");}
}
class Dispatch{
    public static void main(String args[]){
        A_5 a=new A_5();
        B_5 b=new B_5();
        C_5 c=new C_5();
        A_5 ref;
        ref=a;
        ref.show();
        ref=b;
        ref.show();
        ref=c;
        ref.show();}
}