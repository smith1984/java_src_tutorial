package MyFirstProject;

/**
 * Created by ito on 09.03.17.
 */
public class PetMaster {
    public static void main(String[] args){
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Чик Чирик");
        System.out.println(petReaction);
        myPet.sleep();
    }
}
