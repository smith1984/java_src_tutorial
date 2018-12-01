package Ch_4;

class MyClass_3{
    // Поле для нумерации объектов:
    int number=0;
    // Ссылка на следующий обект;
    MyClass_3 next=this;
    void create(int n){
        int i;
        MyClass_3 objA=this;
        MyClass_3 objB;
// Создание списка:
        for(i=1;i<=n;i++){
            objB=new MyClass_3();
            objA.next=objB;
            objB.number=objA.number+1;
            objA=objB;}
// Поледний объект списка ссылается на начальный:
        objA.next=this;
    }
    // Номер объекта в списке:
    int getNumber(int k){
        int i;
        MyClass_3 obj=this;
        for(i=1;i<=k;i++) obj=obj.next;
        return obj.number;}
}
class ObjList{
    public static void main(String[] args){
// Исходный объект:
        MyClass_3 obj=new MyClass_3();
// Создание списка из 4-х объектов (начальный + еще 3 объекта):
        obj.create(3);
// Проверка содержимого списка:
        System.out.println("Значение поля number объектов:");
        System.out.println("2-й после начального -> "+obj.getNumber(2));
        System.out.println("4-й после начального -> "+obj.getNumber(4));
        System.out.println("2-й после 1-го -> "+obj.next.getNumber(2));
    }}