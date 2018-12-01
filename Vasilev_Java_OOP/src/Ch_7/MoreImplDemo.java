package Ch_7;

// Первый интерфейс:
interface One{
    void setOne(int n);
}
// Второй интерфейс:
interface Two{
    void setTwo(int n);
}
// Суперкласс:
class ClassA{
    int number;
    void show(){
        System.out.println("Поле number: "+number);}
}
// Подкласс наследует суперкласс и реализует интерфейсы:
class ClassB extends ClassA implements One,Two{
    int value;
    // Метод первого интерфейса:
    public void setOne(int n){
        number=n;}
    // Метод второго интерфейса:
    public void setTwo(int n){
        value=n;}
    // Переопределение метола суперкласса:
    void show(){
        super.show();
        System.out.println("Поле value: "+value);}
}
class MoreImplDemo{
    public static void main(String[] args){
// Интерфейсные переменные:
        One ref1;
        Two ref2;
// Создание объекта:
        ClassB obj=new ClassB();
// Интерфейсные ссылки:
        ref1=obj;
        ref2=obj;
// Вызов методов:
        ref1.setOne(10);
        ref2.setTwo(-50);
// Проверка результата:
        obj.show();}
}