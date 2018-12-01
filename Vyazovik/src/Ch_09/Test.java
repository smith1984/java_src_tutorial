package Ch_09;

/**
 * Created by ito on 31.03.17.
 */
public class Test implements Cloneable {
    Poin p;
    int height;

    Test (int x, int y, int z){
        p = new Poin(x, y);
        height = z;
    }

    public static void main(String[] args) {
        Test t1 = new Test(1,2,3);
        Test t2 = null;
        try {
            t2= (Test)t1.clone();
        }
        catch (Exception e){}
        t1.p.x = -1;
        t1.height = -1;
        System.out.println(t2.p.x + " " + t2.height);

    }
}

class Poin{
    int x,y;
    Poin(int x, int y){
        this.x = x;
        this.y = y;
    }
}
