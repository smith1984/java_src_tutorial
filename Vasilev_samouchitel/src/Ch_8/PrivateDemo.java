package Ch_8;

// Суперкласс с закрытыми членами:
class Base{
    // Закрытое текстовое поле:
    private String name;
    // Закрытое числовое поле:
    private int number;
    // Конструктор суперкласса:
    Base(String name,int number){
        this.name=name;
        this.number=number;
    }
    // Закрытый метод суперкласса:
    private void show(){
        System.out.println("Объект с именем "+name);}
    // Открытый метод суперкласса:
    void showAll(){
// Обращение к закрытому методу суперкласса:
        show();
// Обращение к закрытому полю суперкласса:
        System.out.println("Числовое поле объекта равно "+number);}
    // Открытый метод суперкласса:
    void setAll(String name,int number){
// Обращение к закрытым полям суперкласса:
        this.name=name;
        this.number=number;}
}
// Подкласс:
class SubBase extends Base{
    // Конструктор подкласса:
    SubBase(String str,int num){
// Вызов конструктора суперкласса:
        super(str,num);
// Отображение закрытых "ненаследуемых" полей
// с помощью наследуемого открытого метода:
        showAll();}
}
public class PrivateDemo {
    public static void main(String[] args){
// Создание объекта подкласса:
        SubBase obj=new SubBase("НОВЫЙ",1);
// Изменение значений "несуществующих" полей объекта подкласса:
        obj.setAll("ТОТ ЖЕ САМЫЙ",2);
// Отображение значений "несуществующих" полей объекта подкласса:
        obj.showAll();}
}