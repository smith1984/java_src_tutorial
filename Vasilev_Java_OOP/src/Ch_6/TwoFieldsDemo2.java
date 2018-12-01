package Ch_6;

// Суперкласс:
class MyClassA_2{
    // Поле:
    int number;
    // Конструктор суперкласса:
    MyClassA_2(int a){
        number=a;
        System.out.println("Создан объект суперкласса с полем "+number);}
    // Отображение значения поля:
    void showA(){
        System.out.println("Поле number: "+number);}
}
// Подкласс:
class MyClassB_2 extends MyClassA_2{
    // Поле с тем же именем:
    int number;
    // Конструктор подкласса:
    MyClassB_2(int a){
        super(a-1); // Вызов конструктора суперкласса
        number=a;   // Поле из подкласса
// Обращение к полю из суперкласса и подкласса:
        System.out.println("Создан объект с полями: "+super.number+" и "+number);}
    // Отображение значения поля:
    void showB(){
// Обращение к полю из суперкласса и подкласса:
        System.out.println("Поля объекта "+super.number+" и "+number);}
}
class TwoFieldsDemo2{
    public static void main(String[] args){
// Создание объекта подкласса:
        MyClassB_2 obj=new MyClassB_2(5);
// Изменение значения поля:
        obj.number=10;
// Отображение значений полей:
        obj.showA();
        obj.showB();
    }}