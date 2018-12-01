package Ch_9;

class MyClass{
    // Поле объекта - символьный массив:
    char[] code;
    // Поле объекта - целочисленный массив:
    int count;
    // Поле объекта - текст:
    String name;
    // Конструктор класса:
    MyClass(char[] code,int count,String name){
        int i;
// Создание массива:
        this.code=new char[code.length];
// Заполнение массива:
        for(i=0;i<code.length;i++){
            this.code[i]=code[i];}
// Значение числового поля:
        this.count=count;
// Создание текстового объекта:
        this.name=new String(name);}
    // Переопределение метода toString():
    public String toString(){
// Локальная текстовая переменная:
        String text="Значения полей объекта.\n";
// Формирование значения локальной текстовой переменной:
        text+="Поле name: "+name+"\n";
        text+="Поле count: "+count+"\n";
        text+="Поле code: |";
        for(int i=0;i<code.length;i++){
            text+=" "+code[i]+" |";}
// Результат метода:
        return text;}
}
public class toStringDemo{
    public static void main(String[] args){
// Создание объекта:
        MyClass obj=new MyClass(new char[]{'Z','A','R','Q','W'},100,"НОВЫЙ");
// "Отображение" объекта:
        System.out.println(obj);}
}