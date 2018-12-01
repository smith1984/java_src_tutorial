package Ch_5;

class MyClass2{
    // Поля класса:
    double Re,Im;
    // Метод для отображения значений полей:
    void show(){
        System.out.println("Поля объекта:\nRe="+Re+" и Im="+Im);}
    // Конструктор без аргументов:
    MyClass2(){
// Вывод сообщения:
        System.out.println("Создание нового объекта!");
// Инициализация полей:
        Re=0;
        Im=0;
// Отображение значения полей:
        show();}
    // Конструктор с одним аргументом:
    MyClass2(double x){
// Вывод сообщения:
        System.out.println("Создание нового объекта!");
// Инициализация полей:
        Re=x;
        Im=x;
// Отображение значения полей:
        show();}
    // Конструктор с двумя аргументами:
    MyClass2(double x,double y){
// Вывод сообщения:
        System.out.println("Создание нового объекта!");
// Инициализация полей:
        Re=x;
        Im=y;
// Отображение значения полей:
        show();}
}
class ConstrDemo2{
    public static void main(String[] args){
// Конструктор без аргументов:
        MyClass2 obj1=new MyClass2();
// Конструктор с одним аргументом:
        MyClass2 obj2=new MyClass2(10);
// Конструктор с двумя аргументами:
        MyClass2 obj3=new MyClass2(100,200);
    }
}
