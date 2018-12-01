package Cp_23;

import java.io.*;
class PrWr{
    public static void main(String[] args){
        try{
            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(System.in, "Cp866"));
            PrintWriter pw = new PrintWriter(
                    new OutputStreamWriter(System.out, "Cp866"), true);
            String s = "Это строка с русским текстом";
            System.out.println("System.out puts: " + s);
            pw.println("PrintWriter puts: " + s);
            int c = 0;
            pw.println("Посимвольный ввод:");
            while ((c = br.read()) != -1)
                pw.println((char)c);
            pw.println("Построчный ввод:");
            do{
                s = br.readLine();
                pw.println(s);
            }while(!s.equals("q"));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}