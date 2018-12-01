package Cp_21;

class CipherException extends Exception{
    private String msg;
    CipherException(){ msg = null; }
    CipherException(String s){ msg = s; }
    public String toString(){
        return "CipherException (" + msg + ")";
    }
}
public class ExceptDemo{
    static public void handle(int cipher) throws CipherException{
        System.out.println("handle()'s beginning");
        if (cipher < 0 || cipher > 9)
            throw new CipherException("" + cipher);
        System.out.println("handle()'s ending");
    }
    public static void main(String[] args){
        try{
            handle(1);
            handle(10);
        }catch(CipherException ce){
            System.out.println("caught " + ce);
            ce.printStackTrace();
        }
    }
}