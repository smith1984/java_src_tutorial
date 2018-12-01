package Ch_6;

class A_3{
    void show(){
        System.out.println("Метод класса А");}
}
class B_3 extends A_3{
    void show(String msg){
        System.out.println(msg);}
}
class C_3 extends B_3{
    void show(){
        System.out.println("Метод класса C");}
}
class MultiOverride{
    public static void main(String args[]){
        A_3 obj1=new A_3();
        B_3 obj2=new B_3();
        C_3 obj3=new C_3();
        obj1.show();
        obj2.show();
        obj2.show("Класс В");
        obj3.show();
        obj3.show("Класс С");}
}