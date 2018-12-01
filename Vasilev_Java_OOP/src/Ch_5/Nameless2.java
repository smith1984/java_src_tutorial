package Ch_5;

class MyClass3{
    int n,m;
    // Конструктор с двумя аргументами:
    MyClass3(int a,int b){
        n=a;
        m=b;
        System.out.println("Первый конструктор!");}
    // Конструктор создания "копии":
    MyClass3(MyClass3 obj){
        n=obj.n+1;
        m=obj.m-1;
        System.out.println("Второй конструктор!");}
    // Метод для отображения значения полей:
    void show(){
        System.out.println("Значения полей: "+n+" и "+m);}
}
class Nameless2{
    public static void main(String args[]){
// Аргумент конструктора - анонимный объект:
        MyClass3 obj=new MyClass3(new MyClass3(10,100));
// Проверка результата:
        obj.show();}
}
