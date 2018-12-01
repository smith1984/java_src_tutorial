package Ch_8;

// Суперкласс:
class SuperClass{
    // Поля суперкласса:
    int number;
    String name;
    // Метод суперкласса:
    void setNumber(int n){
        number=n;}
}
// Подкласс:
class SubClass extends SuperClass{
    // Поле подкласса:
    char symbol;
    // Метод подкласса:
    void setAll(int n,String txt,char s){
// Вызов метода, описанного в суперклассе:
        setNumber(n);
// Обращение к полю, описанному в суперклассе:
        name=txt;
// Присваивание значения полю подкласса:
        symbol=s;}
    // Метод подкласса:
    void show(){
// Отображение значений полей подкласса:
        System.out.println("Числовое поле: "+number);
        System.out.println("Текстовое поле: "+name);
        System.out.println("Символьное поле: "+symbol);}
}
// Класс с главным методом программы:
public class SubClassDemo{
    // Главный метод программы:
    public static void main(String[] args){
// Создание объекта подкласса:
        SubClass obj=new SubClass();
// Присваивание полям объекта значений:
        obj.setAll(100,"ТЕКСТ",'A');
// Отображение значений полей:
        obj.show();
// Изменение значений полей объекта:
        obj.setNumber(20);
        obj.name="НОВЫЙ";
// Отображение значений полей:
        obj.show();}
}