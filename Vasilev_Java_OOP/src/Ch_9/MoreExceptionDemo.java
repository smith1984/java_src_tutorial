package Ch_9;

class MoreExceptionDemo{
    public static void main(String args[]){
        int a,b;
        try{
            b=0;
// Деление на ноль:
            a=100/b;
        }catch(ArithmeticException e){
// При обработке ошибки использован объект исключения:
            System.out.println("Ошибка: "+e);}
        System.out.println("Выполнение программы продолжено!");}
}