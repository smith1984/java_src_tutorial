package Cp_23;

import java.io.*;
class DOStoUNIX{
    public static void main(String[] args) throws IOException{
    if (args.length != 2){
        System.err.println("Usage: DOStoUNIX Cp866file KOI8_Rfile");
        System.exit(0);
    }
    BufferedReader br = new BufferedReader(
            new InputStreamReader(new FileInputStream(args[0]), "Cp866"));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream(args[1]), "KOI8_R"));
    int c = 0;
    while ((c = br.read()) != -1)
        bw.write((char)c);
    br.close(); bw.close();
    System.out.println("Копирование окончено.");
}
}