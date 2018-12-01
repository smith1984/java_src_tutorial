package Ch_6;

class MySuperClass{  // Суперкласс
    // Закрытое поле:
    private int a;
    // Закрытый метод:
    private void showa(){
        System.out.println("Поле a: "+a);}
    // Открытый метод:
    void seta(int n){
        a=n;
        showa();}
}
class MySubClass extends MySuperClass{ // Подкласс
    int b;
    void setall(int i,int j){
        seta(i);
        b=j;
        System.out.println("Поле b: "+b);}
}
class PrivateSuperDemo{
    public static void main(String arg[]){
// Объект подкласса:
        MySubClass obj=new MySubClass();
        obj.setall(1,5);}
}
