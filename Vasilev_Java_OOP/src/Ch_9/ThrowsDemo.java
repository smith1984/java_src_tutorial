package Ch_9;

class ThrowsDemo{
    // Описание метода:
    static void throwOne() throws IllegalAccessException{
        System.out.println("Ошибка в методе throwOne!");
// Выбрасывание исключения:
        throw new IllegalAccessException("Большая ошибка!");}
    public static void main(String args[]){
        try{
            throwOne(); // Метод выбрасывает исключение
        }catch(IllegalAccessException e){ // Обработка исключения
            System.out.println("Случилась неприятность: "+e);}
    }}
