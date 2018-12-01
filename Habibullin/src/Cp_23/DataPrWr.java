package Cp_23;

import java.io.*;
class DataPrWr{
    public static void main(String[] args) throws IOException{
        DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("fib.txt"));
        int a = 1, b = 1, c = 1;
        for (int k = 0; k < 40; k++){
            System.out.print(b + " ");
            dos.writeInt(b);
            a = b; b = c; c = a + b;
        }
        dos.close();
        System.out.println("\n");
        DataInputStream dis = new DataInputStream(
                new FileInputStream("fib.txt"));
        while (true)
            try{
                a = dis.readInt();
                System.out.print(a + " ");
            }catch(IOException e){
                dis.close();
                System.out.println("End of file");
                System.exit(0);
            }
    }
}
