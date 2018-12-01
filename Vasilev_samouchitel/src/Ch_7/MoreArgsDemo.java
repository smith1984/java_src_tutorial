package Ch_7;

class MyClass3{
    // Имя объекта (текстовое поле):
    String name;
    // Конструктор класса:
    MyClass3(String name){
        this.name=name;}
    // Метод для отображения имени объекта:
    void show(){
        System.out.println("Объект с именем \""+name+"\".");}
}
public class MoreArgsDemo {
    // Статический метод для изменения ссылки на объект:
    static void ChangeRef(MyClass3 obj){
// Создается локальный объект:
        MyClass3 tmp=new MyClass3("Локальный Объект");
// Ссылка на локальный объект присваивается аргументу метода:
        obj=tmp;
// Проверка имени объекта, на который ссылается аргумент:
        obj.show();}
    public static void main(String[] args){
// Создание объекта:
        MyClass3 obj=new MyClass3("Основной Объект");
// Проверка имени объекта:
        obj.show();
// Попытка изменить ссылку на объект:
        ChangeRef(obj);
// Проверка результата:
        obj.show();}
}

