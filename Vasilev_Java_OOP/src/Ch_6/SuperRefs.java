package Ch_6;

class ClassA_4{
    double Re;
    void set(double x){
        Re=x;}
    void show(){
        System.out.println("Класс A:");
        System.out.println("Поле Re: "+Re);}
}
class ClassB_4 extends ClassA_4{
    double Im;
    void set(double x,double y){
        Re=x;
        Im=y;}
    void show(){
        System.out.println("Класс B:");
        System.out.println("Поле Re: "+Re);
        System.out.println("Поле Im: "+Im);}
}
class SuperRefs{
    public static void main(String[] args){
        ClassA_4 objA;
        ClassB_4 objB=new ClassB_4();
        objA=objB;
        objB.set(1,5);
        objB.show();
        objA.set(-10);
        objA.show();}
}
