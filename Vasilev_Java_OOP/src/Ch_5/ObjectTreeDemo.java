package Ch_5;

class ObjectTree{
    // Количество цифр в ID-коде объекта:
    private static int IDnum=8;
    // Уровень объекта (буква):
    private char Level;
    // Номер объекта на уровне:
    private int Number;
    // Код объекта (массив цифр):
    private int[] ID;
    // Ссылка на первый объект:
    ObjectTree FirstRef;
    // Ссылка на второй объект:
    ObjectTree SecondRef;
    // Метод для генерирования ID-кода объекта:
    private void getID(){
        ID=new int[IDnum];
        for(int i=0;i<IDnum;i++)
            ID[i]=(int)(Math.random()*10);
    }
    // Метод для отображения ID-кода объекта:
    private void showID(){
        for(int i=0;i<IDnum;i++)
            System.out.print("|"+ID[i]);
        System.out.print("|\n");
    }
    // Метод для отображения параметров объекта:
    void show(){
        System.out.println("Уровень объекта: \t"+Level);
        System.out.println("Номер на уровне: \t"+Number);
        System.out.print("ID-код объекта: \t");
        showID();
    }
    // Конструктор создания бинарного дерева:
    ObjectTree(int k,char L,int n){
        System.out.println("\tСоздан новый объект!");
        Level=L;
        Number=n;
        getID();
        show();
        if(k==1){
            FirstRef=null;
            SecondRef=null;
        }
        else{
// Рекурсивный вызов конструктора:
            FirstRef=new ObjectTree(k-1,(char)((int)L+1),2*n-1);
            SecondRef=new ObjectTree(k-1,(char)((int)L+1),2*n);}
    }}
class ObjectTreeDemo{
    public static void main(String[] args){
// Дерево объектов:
        ObjectTree tree=new ObjectTree(4,'A',1);
        System.out.println("\tПроверка структуры дерева объектов!");
// Проверка структуры дерева объектов:
        tree.FirstRef.SecondRef.FirstRef.show();
    }}