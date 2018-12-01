package Ch_9;

class ExceptionDemo{
    public static void main(String args[]){
        int a,b;
// Блок контроля исключительной ситуации:
        try{
            b=0;
// Деление на ноль:
            a=100/b;
        }catch(ArithmeticException e){
// Обработка исключительной ситуации:
            System.out.println("Деление на ноль!");
        }
        System.out.println("Выполнение программы продолжено!");}
}