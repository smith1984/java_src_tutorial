package Ch_6;

class MakeObjCopy{
    // Текстовое поле класса:
    String name;
    // Числовое поле класса:
    int number;
    // Конструктор класса (два аргумента):
    MakeObjCopy(String str,int num){
        name=str;
        number=num;}
    // Конструктор создания копии:
    MakeObjCopy(MakeObjCopy obj){
        name=obj.name;
        number=obj.number;}
    // Метод для создания копии объекта:
    MakeObjCopy copy(){
// Создание объекта-копии:
//MakeObjCopy tmp=new MakeObjCopy(name,number);
        MakeObjCopy tmp=new MakeObjCopy(this);
// Возвращение результата:
        return tmp;}
    // Метод для вывода информации об объекте:
    void show(){
        String text="Поля объекта:\n";
        text+="name: "+name+"\nnumber: "+number;
// Вывод на консоль:
        System.out.println(text);}
}
public class MakeObjCopyDemo{
    public static void main(String[] args){
// Создание объектов:
        MakeObjCopy objA=new MakeObjCopy("Первый объект",100);
        MakeObjCopy objB=new MakeObjCopy(objA);
// Отображение информации об объектах:
        objA.show();
        objB.show();
// Изменение второго объекта:
        objB.name="Второй объект";
        objB.number=200;
// Отображение информации об объектах:
        objA.show();
        objB.show();
// "Копирование" объектов:
        objA=objB.copy();
// Отображение информации об объекте:
        objA.show();
// Изменение второго объекта:
        objB.name="Второй объект изменен!";
        objB.number=300;
// Отображение информации об объектах:
        objA.show();
        objB.show();}
}