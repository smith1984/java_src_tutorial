package Ch_2;

/**
 * Created by ito on 25.10.16.
 */
public class MovieTestDrive {
    public static void main (String [] args) {
        Movie one = new Movie () ;
        one.title = "Как Прогореть на Акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Потерянные в Офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt() ;
        Movie three = new Movie();
        three.title = "Байт-Клуб";
        three.genre = "Трагедия, но в целом веселая";
        three.rating = 127;
    }
}
