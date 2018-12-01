package ch_03;

/**
 * Created by ito on 13.09.17.
 */
class Dog{
    String name, say;
}
public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "Бобик";
        dog1.say = "Гав";

        dog2.name = "Шарик";
        dog2.say = "Тяф";

        System.out.println(dog1.name + " " + dog1.say);
        System.out.println(dog2.name + " " + dog2.say);

        Dog dog3 = dog1;

        System.out.println(dog1 == dog3);
        System.out.println(dog1.equals(dog3));
    }
}
