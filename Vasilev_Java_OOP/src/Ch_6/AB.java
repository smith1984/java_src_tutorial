package Ch_6;

class A{  // Суперкласс
    int i,j;
    void showij(){
        System.out.println("Поля i и j: "+i+" и "+j);}
}
class B extends A{ // Подкласс
    int k;
    void showk(){
        System.out.println("Поле k: "+k);}
    void sum(){
// Обращение к наследуемым полям:
        System.out.println("Сумма i+j+k="+(i+j+k));}
}
class AB{
    public static void main(String arg[]){
// Объект суперкласса:
        A SuperObj=new A();
// Объект подкласса:
        B SubObj=new B();
        SuperObj.i=10;
        SuperObj.j=20;
        SuperObj.showij();
        SubObj.i=7;
        SubObj.j=8;
        SubObj.k=9;
        SubObj.showij();
        SubObj.showk();
        SubObj.sum();}
}