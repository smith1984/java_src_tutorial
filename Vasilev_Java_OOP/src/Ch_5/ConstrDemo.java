package Ch_5;

class MyClass{
    // Поля класса:
    double Re,Im;
    // Метод для отображения значений полей:
    void show(){
        System.out.println("Поля объекта:\nRe="+Re+" и Im="+Im);}
    // Конструктор:
    MyClass(){
// Вывод сообщения:
        System.out.println("Создание нового объекта!");
// Инициализация полей:
        Re=0;
        Im=0;
// Отображение значения полей:
        show();}
}
class ConstrDemo{
    public static void main(String[] args){
// Создание объекта:
        MyClass obj=new MyClass();
    }
}