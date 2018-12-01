package Ch_3;

/**
 * Created by ito on 20.03.17.
 */
public class TenDemo {
    public static void main (String[] args){
        Ten s1 = new Ten();
        Ten s2 = new Ten();
        if (s1.x == s2.x)
            System.out.println(s1.x + " = " + s2.x);
    }
}

class Ten{
    int x;
    Ten(){
        x = 10;
    }
}
