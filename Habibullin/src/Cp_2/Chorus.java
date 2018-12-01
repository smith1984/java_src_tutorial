package Cp_2;

abstract class Pet{
    abstract void voice();
}
class Dog extends Pet{
    int k = 10;
    @Override
    void voice(){
        System.out.println("Gav-gav!");
    }
}
class Cat extends Pet{
    @Override
    void voice(){
        System.out.println("Miaou!");
    }
}
class Cow extends Pet{
    @Override
    void voice(){
        System.out.println("Mu-u-u!");
    }
}
public class Chorus{
    public static void main(String[] args){
        Pet[] singer = new Pet[3];
        singer[0] = new Dog();
        singer[1] = new Cat();
        singer[2] = new Cow();
        for (Pet p: singer)
            p.voice();
    }
}