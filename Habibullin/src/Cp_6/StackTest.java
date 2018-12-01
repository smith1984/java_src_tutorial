package Cp_6;

import java.util.*;
class StackTest{
    static boolean checkParity(String expression, String open, String close){
        Stack<String> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(expression,
                " \t\n\r+*/-(){}", true);
        while (st.hasMoreTokens()){
            String tmp = st.nextToken();
            if (tmp.equals(open)) stack.push(open);
            if (tmp.equals(close)) stack.pop();
        }
        if (stack.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args){
        System.out.println(
                checkParity("a — (b — (c — a) / (b + c) — 2)", "(", ")"));
    }
}
