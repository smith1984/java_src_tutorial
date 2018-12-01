package Ch_4;
class MyStatic{
    // Статические поля:
    static int a=50;
    static int b=120;
    // Статический метод:
    static void callme(){
        System.out.println("a="+a);
    }}
// Использование статических элементов:
class StaticDemo{
    public static void main(String args[]){
// Вызов статического метода через класс:
        MyStatic.callme();
// Объекты класса:
        MyStatic obj1=new MyStatic();
        MyStatic obj2=new MyStatic();
// Вызов статического поля через объект:
        obj1.a=-25;
// Вызов статического поля через объект:
        System.out.println("a="+obj2.a);
// Вызов статического поля через класс:
        System.out.println("b="+MyStatic.b);
    }}