package Cp_6;


import java.util.*;

public class MyParserList {
    public static void main(String[] args) throws Exception{
        ArrayList<String> stringArrayList = new ArrayList<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();
        ArrayDeque<String> stringArrayDeque = new ArrayDeque<>();
        String s = "Строка, которую мы хотим разобрать на слова.";
        String tmp ="";
        StringTokenizer st = new StringTokenizer(s, " \t\n\r,.");
        while (st.hasMoreTokens()) {
            tmp = st.nextToken();
            stringArrayList.add(tmp);
            stringLinkedList.add(tmp);
            stringArrayDeque.add(tmp);
        }
        System.out.println(stringArrayList.get(0));
        System.out.println(stringLinkedList.get(0));
        System.out.println(stringArrayDeque.getFirst());
        System.out.println(stringArrayList.get(stringArrayList.size() - 1));
        System.out.println(stringLinkedList.get(stringLinkedList.size() - 1));
        System.out.println(stringArrayDeque.getLast());
    }
}