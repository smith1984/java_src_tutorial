package Ch_8;

// Суперкласс:
class A{
    // Поля суперкласса:
    int number;
    char symbol;
    // Конструктор суперкласса без аргументов:
    A(){
        number=0;
        symbol='A';
        System.out.println("Конструктор без аргументов!");
        show();}
    // Конструктор суперкласса с одним аргументом:
    A(int n){
        number=n;
        symbol='B';
        System.out.println("Конструктор с одним аргументом!");
        show();}
    // Конструктор суперкласса с двумя аргументами:
    A(int n,char s){
        number=n;
        symbol=s;
        System.out.println("Конструктор с двумя аргументами!");
        show();}
    // Метод для отображения полей:
    void show(){
        System.out.println("Поля "+number+" и "+symbol+".");}
}
// Подкласс:
class B extends A{
    // Текстовое поле подкласса:
    String text;
    // Конструктор подкласса без аргументов:
    B(){
// Вызов конструктора суперкласса (без аргументов):
        super();
        text="Без аргументов";
        showText();}
    // Конструктор подкласса с одним аргументом:
    B(String txt){
// Вызов конструктора суперкласса (с одним аргументом):
        super(txt.length());
        text=txt;
        showText();}
    // Конструктор подкласса с тремя аргументами:
    B(int n,char s,String txt){
// Вызов конструктора суперкласса (с двумя аргументами):
        super(n,s);
        text=txt;
        showText();}
    // Метод для отображения текстового поля:
    void showText(){
        System.out.println("Текстовое поле \""+text+"\".");}
}
public class SubConstrDemo{
    public static void main(String[] args){
// Создание объектов (анонимных) подкласса.
// Используются разные конструкторы:
        new B();
        new B("Один аргумент");
        new B(100,'F',"Три аргумента");}
}
