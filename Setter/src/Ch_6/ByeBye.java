package Ch_6;

/**
 * Created by ito on 21.03.17.
 */
public class ByeBye {
    public static void main(String[] args) {
        if (args.length == 0 )
            System.exit(1);
        for (String str: args)
            System.out.println(str);
        System.out.println("ByeBye ...");
        System.exit(0);
    }
}
