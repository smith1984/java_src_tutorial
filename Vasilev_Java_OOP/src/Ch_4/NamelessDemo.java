package Ch_4;
class MyClass_2{
    void show(String msg){
        System.out.println(msg);}
}
class NamelessDemo{
    public static void main(String  args[]){
// »спользование анонимного объекта:
        new MyClass_2().show("Ётот объект не имеет имени");}
}