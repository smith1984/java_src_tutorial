package MyFirstProject;

/**
 * Created by ito on 09.03.17.
 */
public class Pet {
    int age;
    int weidth;
    int height;
    String color;

    public void sleep(){
        System.out.println("Спокойной ночи, до завтра!");
    }

    public void eat(){
        System.out.println("Я очень голоден. Давай перекусим.");
    }

    public String say(String aWord){
        String petResponse = "Ну ладно " + aWord;
        return petResponse;
    }
}
