package Ch_3;

/**
 * Created by ito on 20.03.17.
 */
public class ParaByRefDemo {
    public static void main (String[] args){
        ParaByRef p = new ParaByRef(2, 3);
        ParaByRef q = new ParaByRef(3, 2);
        System.out.println("p.x = " + p.x + "\np.y = " + p.y);
        System.out.println("q.x = " + q.x + "\nq.y = " + q.y);

        p.callByRef(q);
        System.out.println("p.x = " + p.x + "\np.y = " + p.y);
        System.out.println("q.x = " + q.x + "\nq.y = " + q.y);

    }
}

class ParaByRef{
    int x, y;

    ParaByRef (int x, int y){
        this.x = x;
        this.y = y;
    }

    void callByRef (ParaByRef o){
        o.x +=this.x;
        o.y +=this.y;
    }
}
