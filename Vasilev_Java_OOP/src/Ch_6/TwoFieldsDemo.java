package Ch_6;

// Суперкласс:
class MyClassA{
    // Поле:
    int number;
    // Конструктор суперкласса:
    MyClassA(){
        number=0;
        System.out.println("Создан объект суперкласса с полем "+number);}
    // Отображение значения поля:
    void showA(){
        System.out.println("Поле number: "+number);}
}
// Подкласс:
class MyClassB extends MyClassA{
    // Поле с тем же именем:
    int number;
    // Конструктор подкласса:
    MyClassB(){
        super(); // Вызов конструктора суперкласса
        number=100;
        System.out.println("Создан объект подкласса с полем "+number);}
    // Отображение значения поля:
    void showB(){
        System.out.println("Поле number: "+number);}
}
class TwoFieldsDemo{
    public static void main(String[] args){
// Создание объекта подкласса:
        MyClassB obj=new MyClassB();
// Изменение значения поля:
        obj.number=50;
// Отображение значения поля:
        obj.showA();
        obj.showB();
    }}