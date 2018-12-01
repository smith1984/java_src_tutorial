package Cp_2;

class Automobile{
    private static int number;
    Automobile(){
        number++;
        System.out.println("From Automobile constructor:" +
                " number = " + number);
    }
}
public class AutomobileTest{
    public static void main(String[] args){
        Automobile lada2105 = new Automobile(),
                fordScorpio = new Automobile(),
                oka = new Automobile();
    }
}
