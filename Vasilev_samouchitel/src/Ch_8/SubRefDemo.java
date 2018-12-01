package Ch_8;

// Суперкласс:
class Base2{
    // Текстовое поле суперкласса:
    String name;
    // Конструктор суперкласса:
    Base2(String name){
        this.name=name;}
    // Метод для отображения значения поля:
    void show(){
        System.out.println("Объект суперкласса: "+name);}
    // Метод выводит приветствие:
    void sayHello(){
        System.out.println("Всем привет!");}
}
// Подкласс:
class SubBase2 extends Base2{
    // Символьное поле подкласса:
    char code;
    // Конструктор подкласса:
    SubBase2(String name,char code){
        super(name);
        this.code=code;}
    // Переопределение метода:
    void show(){
        System.out.println("Объект подкласса: "+name+". Код: "+code);}
}
public class SubRefDemo{
    public static void main(String[] args){
// Объектная переменная суперкласса:
        Base2 obj;
// Ссылка на объект суперкласса:
        obj=new Base2("Базовый");
// Обращение к методам объекта суперкласса:
        obj.sayHello();
        obj.show();
// Ссылка на объект подкласса:
        obj=new SubBase2("Производный",'A');
// Обращение к методам объекта подкласса:
        obj.sayHello();
        obj.show();}
}
