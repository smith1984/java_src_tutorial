package Ch_6;

// Абстрактный суперкласс:
abstract class A_6{
    // Абстрактный метод:
    abstract void callme();
    // Неабстрактный метод:
    void callmetoo(){
        System.out.println("Второй метод");}
}
// Подкласс:
class B_6 extends A_6{
    // Определение наследуемого абстрактного метода:
    void callme(){
        System.out.println("Первый метод");}
}
class AbstDemo{
    public static void main(String args[]){
// Объект подкласса:
        B_6 obj=new B_6();
        obj.callme();
        obj.callmetoo();}
}