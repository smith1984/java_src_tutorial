package Ch_2;

/**
 * Created by ito on 17.03.17.
 */
public class ExtendedBreakDemo {
    public static void main(String[] args){
        for (int i = 1; i < 4; i++) {
            block1:
            {
                block2:
                {
                    block3:
                    {
                        System.out.println("\ni равно" + i);
                        if (i == 1)
                            break block1;
                        if (i == 2)
                            break block2;
                        if (i == 3)
                            break block3;
                        System.out.println("Эта строка никогда не выведится");
                    }
                    System.out.println("Завершен блок 3");
                }
                System.out.println("Завершен блок 2");
            }
            System.out.println("Завершен блок 1");
        }
        System.out.println("Конец цикла for");
    }

}
