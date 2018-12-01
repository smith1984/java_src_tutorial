package Ch_2;

/**
 * Created by ito on 17.03.17.
 */
public class AlphabetDoWhileDemo {
    public static void main (String[] args){
        char ch = 'я';
        do{
            System.out.print(ch +" ");
            ch--;
        }
        while (ch >= 'а');
    }
}
