package Cp_6;

import java.util.*;

class MyParser{
    public static void main(String[] args){
        Vector<String> v = new Vector<>();
        String s = "Строка, которую мы хотим разобрать на слова.";
        StringTokenizer st = new StringTokenizer(s, " \t\n\r,.");
        while (st.hasMoreTokens()){
            v.add(st.nextToken());
        }
        System.out.println(v.firstElement()); // Первый элемент
        System.out.println(v.lastElement()); // Последний элемент
        v.setSize(4); // Уменьшаем число элементов
        v.add("собрать."); // Добавляем в конец укороченного вектора.
        v.set(3, "опять"); // Ставим в позицию 3.
        for (int i = 0; i < v.size(); i++) // Перебираем весь вектор.
            System.out.print(v.get(i) + " ");
        System.out.println();
        for (String str: v) // Другой способ перебора элементов вектора.
            System.out.print(str + " ");
        System.out.println();

        // Еще способ обхода коллекции использует итератор:
        Iterator it = v.iterator(); // Получаем итератор вектора.
        try{
            while (it.hasNext()) // Пока в векторе есть элементы,
                System.out.println(it.next()); // выводим текущий элемент.
        }catch(Exception e){}
    }
}
