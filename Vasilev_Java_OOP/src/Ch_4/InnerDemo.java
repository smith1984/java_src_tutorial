package Ch_4;

class MyOuter{
    // Поле внешнего класса:
    int number=123;
    // Метод внешнего класса:
    void show(){
// Создание объекта внутреннего класса:
        MyInner InnerObj=new MyInner();
// Вызов метода объекта внутреннего класса:
        InnerObj.display();}
    // Внутренний класс:
    class MyInner{
        // Метод внутреннего класса:
        void display(){
            System.out.println("Поле number="+number);}
    }
}
class InnerDemo{
    public static void main(String  args[]){
// Создание объекта внешнего класса:
        MyOuter OuterObj=new MyOuter();
// Вызов метода объекта внешнего класса:
        OuterObj.show();}
}
