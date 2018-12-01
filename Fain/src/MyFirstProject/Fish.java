package MyFirstProject;

/**
 * Created by ito on 09.03.17.
 */
public class Fish extends Pet {
    int currentDepth = 0;
    final int DEFAULT_DIVING = 5;
    public int dive(){
        currentDepth=currentDepth + DEFAULT_DIVING;
        if (currentDepth > 100){
            System.out.println("Я маленькая рыбка и " +
                    " не могу нырять глубже 100 метров");
            currentDepth=currentDepth - DEFAULT_DIVING;
        }else{
            System.out.println("Погружаюсь на " +
                    DEFAULT_DIVING + " м");
            System.out.println("Я на " + currentDepth +
                    " метров ниже уровня моря");
        }
        return currentDepth;
    }
    public int dive(int howDeep){
        currentDepth +=howDeep;
        if (currentDepth > 100) {
            System.out.println("Я маленькая рыбка и не могу плавать глубже 100 метров");
            currentDepth -=howDeep;
        }
        else
        System.out.println("Погружусь ещё на  " + howDeep + " фунтов.\n Я на глубине " + currentDepth +" фунтов" +
                " ниже уровня моря." );
        return currentDepth;
    }
    public String say(String something){
        return "Ты что, не знаешь, что рыбы не разговаривают?";
    }
}
