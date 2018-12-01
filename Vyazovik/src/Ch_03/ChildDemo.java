package Ch_03;

/**
 * Created by ito on 30.03.17.
 */
public class ChildDemo {
    public static void main(String[] args) {
        Parent p = new ChildOfChild();
        System.out.println(p instanceof Parent);
        System.out.println(p instanceof Child);
        System.out.println(p instanceof ChildOfChild);
        p = new Child2();
        System.out.println(p instanceof Child);
        String s = "abc";
        Class cl = s.getClass();
        System.out.println(cl);
        System.out.println(cl.getName()+ "@" + cl.hashCode());
        System.out.println(cl.toString());
    }
}

class Parent{}
class Child extends Parent{}
class ChildOfChild extends Child{}
class Child2 extends Parent{}
