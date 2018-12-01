package Ch_5;

class OverloadDemo2{
    // Метод без аргументов:
    void test(){
        System.out.println("Аргументы отсутствуют!");}
    // Метод с двумя аргументами:
    void test(int a,int b){
        System.out.println("Аргументы типа int: "+a+" и "+b);}
    // Метод с одним аргументом типа double:
    void test(double a){
        System.out.println("аргумент типа double: "+a);}
}
class Overload2{
    public static void main(String args[]){
        OverloadDemo2 obj=new OverloadDemo2();
        int i=88;
        obj.test();
        obj.test(10,20);
        obj.test(i);  // приведение типа!
        obj.test(12.5);
    }}