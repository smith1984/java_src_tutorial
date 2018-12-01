package Ch_5;

//  Класс с перегруженным методом:
class OverloadDemo{
    // Вариант метода без аргументов:
    void test(){
        System.out.println("Аргументы отсутствуют!");
    }
    // Вариант метода с одним целым аргументом:
    void test(int a){
        System.out.println("аргумент типа int: "+a);
    }
    // Вариант метода с аргументом типа double и результатом типа double:
    double test(double a){
        System.out.println("аргумент типа double: "+a);
        return a;
    }}
//  Класс с методом main():
class Overload{
    public static void main(String args[]){
        OverloadDemo obj=new OverloadDemo();
        double result;
// Вызов перегруженного метода:
        obj.test();
        obj.test(10);
        result=obj.test(12.5);
        System.out.println("Результат: "+result);
    }}
