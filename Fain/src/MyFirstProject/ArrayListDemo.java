package MyFirstProject;

import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
// Создаем и заполняем ArrayList
        ArrayList friends = new ArrayList();
        friends.add("Елена");
        friends.add("Анна");
        friends.add("Николай");
        friends.add("Сергей");
// Сколько в нем друзей?
        int friendsCount = friends.size();
// Печатаем содержимое ArrayList
        for (int i=0; i<friendsCount; i++){
            System.out.println("Друг №" + i + " это "+friends.get(i));
        }
    }
}