package Ch_6;

import sun.misc.BASE64Decoder;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class PasswordComparer {
    private MessageDigest d = null;
    private String encrypted = null;

    private int failedCount = 0;
    private static int maxFailedCount = 3;

    private PasswordComparer(){}

    PasswordComparer(String encrypted, boolean decode, String algorithm){

        if (decode == true){
            try{
                BASE64Decoder dec = new BASE64Decoder();
                this.encrypted = new String(dec.decodeBuffer(encrypted));
                dec = null;
            }
            catch (IOException e){}
        }
        else
            this.encrypted = encrypted;

        try {
            d = MessageDigest.getInstance(algorithm);
        }
        catch (NoSuchAlgorithmException e){}
    }

    public PasswordComparer(String encrypted){
        this(encrypted, false, "sha-1");
    }

    public PasswordComparer(String encrypted, boolean decode){
        this(encrypted, decode,"sha-1");
    }

    public int getFailedCount(){
        return failedCount;
    }

    private synchronized void incrementFailedCount(){
        failedCount++;
    }

    private synchronized void resetFailedCount(){
        failedCount = 0;
    }

    public synchronized boolean isEqual(String userPassword) throws IllegalAccessException{
        boolean success = false;

        if (getFailedCount() == maxFailedCount)
            throw new IllegalAccessException("Достигнуто максимальное число неудачных попыток.");
        try{
            String userPasswordEncrypt = new String(PasswordEncrypter.encrypt(userPassword, d.getAlgorithm()));
            success = d.isEqual(encrypted.getBytes(), userPasswordEncrypt.getBytes());
        }
        catch (IllegalArgumentException e){}

        if (success == true)
            resetFailedCount();
        else
            incrementFailedCount();

        return success;
    }

}
