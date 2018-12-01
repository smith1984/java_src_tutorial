package Ch_11;

import java.io.*;
class MyStringInput{
    public static void main(String args[]) throws IOException{
        String str="Ваш заказ: ";
        String s;
        int count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Что-то желаете?");
        s=br.readLine();
        while(!s.equalsIgnoreCase("Нет")){
            count++;
            str=str+"\n"+count+": "+s.toLowerCase();
            System.out.println(str+"\n Еще что-то?");
            s=br.readLine();}
        System.out.println(str);
        System.out.println("Спасибо! Ваш заказ принят!");
    }
}
