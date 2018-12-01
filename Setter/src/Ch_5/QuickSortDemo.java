package Ch_5;

/**
 * Created by ito on 21.03.17.
 */
public class QuickSortDemo {
    public static void main(String[] args) {
        char[] sec = {'h', 'e', 'd', 'a', 'c', 'i'};
        for( char ch:sec)
            System.out.print(String.valueOf(ch) +" ");
        QuickSort.sort(sec);
        System.out.println();
        for( char ch:sec)
            System.out.print(String.valueOf(ch) +" ");

    }
}
