package Cp_6;

import java.util.*;

interface Voice{
    void voice();
}
class Dog implements Voice{
    @Override
    public void voice(){
        System.out.println("Gav-gav!");
    }
}
class Cat implements Voice{
    @Override
    public void voice(){
        System.out.println("Miaou!");
    }
}
class Cow implements Voice{
    @Override
    public void voice(){
        System.out.println("Mu-u-u!");
    }
}
public class Chorus{
    public static void main(String[] args){
        List<Voice> singer = new ArrayList<>();
        singer.add(new Dog());
        singer.add(new Cat());
        singer.add(new Cow());
        for (Voice v: singer)
            v.voice();
    }
}
