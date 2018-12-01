package Ch_6;

// Суперкласс:
class MySuperClass_2{
    int a;
    void showa(){
        System.out.println("Объект с полем a="+a);}
    // Конструкторы суперкласса:
    MySuperClass_2(){
        a=0;
        showa();}
    MySuperClass_2(int i){
        a=i;
        showa();}
}
// Подкласс:
class MySubClass_2 extends MySuperClass_2{
    double x;
    void showx(){
        System.out.println("Объект с полем x="+x);}
    // Конструкторы подкласса:
    MySubClass_2(){
        super(); // Вызов конструктора суперкласса
        x=0;
        showx();}
    MySubClass_2(int i,double z){
        super(i); // Вызов конструктора суперкласса
        x=z;
        showx();}
}
class SuperConstrDemo{
    public static void main(String[] args){
        System.out.println("Первый объект:");
        MySubClass_2 obj1=new MySubClass_2();
        System.out.println("Второй объект:");
        MySubClass_2 obj2=new MySubClass_2(5,3.2);}
}