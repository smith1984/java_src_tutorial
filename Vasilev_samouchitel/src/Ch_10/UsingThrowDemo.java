package Ch_10;

// Класс "пользовательской" ошибки:
class MyException extends Exception{
    // Счетчик ошибок:
    static int count=0;
    // Текст для описания ошибки:
    String name;
    // Конструктор класса:
    MyException(String name){
        count++;
        this.name=name;
    }
    // Переопределение метода toString():
    public String toString(){
        String text="Возникла ошибка!\n";
        text+="Описание: "+name+"\n";
        text+="Номер ошибки: "+count;
        return text;}
}
// Просто класс:
class MyClass{
    // Числовое поле:
    private int number;
    // Метод для отображения значения поля:
    void show(){
        System.out.println("Значение поля: "+number);}
    // Конструктор класса:
    MyClass(int number){
        try{
            if(number>10){
                number=10;
                // Генерирование ошибки:
                throw new MyException("Слишком большое число!");}
            if(number<0){
                number=0;
                // Генерирование ошибки:
                throw new MyException("Отрицательное число!");}
        }catch(MyException obj){ // Обработка ошибки
            System.out.println(obj);}
        this.number=number;
        show();}
    // Метод не обрабатывает ошибку:
    void set(int number) throws MyException{
// Генерирование ошибки:
        if(number>10||number<0) throw new MyException("Неверный аргумент!");
        this.number=number;
        System.out.println("Все в порядке!");
        show();}
}
// Главный класс программы:
public class UsingThrowDemo{
    public static void main(String[] args){
// Создание объектов класса MyClass (генерируется ошибка):
        MyClass objA=new MyClass(15);
        MyClass objB=new MyClass(-1);
// Отслеживается ошибка:
        try{
            objA.set(100);
        }catch(MyException e){ // Обработка ошибки
            System.out.println(e);
            objA.show();}
// Создание объекта ошибки:
        MyException objE=new MyException("Несуществующая ошибка!");
        try{
// Генерирование ошибки:
            throw objE;
        }catch(MyException e){ // Обработка ошибки
            System.out.println(e);}
    }}
