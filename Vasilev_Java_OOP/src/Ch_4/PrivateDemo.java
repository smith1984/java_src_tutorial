package Ch_4;

class MyClass{
    // Закрытые поля:
    private int a;
    private int b;
    // Закрытый метод:
    private void showab(){
// Обращение к закрытым полям в классе:
        System.out.println("a="+a);
        System.out.println("b="+b);}
    // Открытый метод:
    public void setab(int x,int y){
// Обращение к закрытым полям в классе:
        a=x;
        b=y;
        System.out.println("Присвоены значения полям!");}
    // Открытый метод:
    void getab(){
        System.out.println("Проверка значений полей:");
// Обращение к закрытому методу в классе:
        showab();}
}
class PrivateDemo{
    public static void main(String[] args){
// Создание объекта:
        MyClass obj=new MyClass();
// Вызов открытых методов:
        obj.setab(3,5);
        obj.getab();
    }}