package Ch_6;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by ito on 21.03.17.
 */
public class PasswordEncrypter {
    public static byte[] encrypt(String password, String Algorithm) throws IllegalArgumentException{
        try
        {
            MessageDigest digest = MessageDigest.getInstance(Algorithm);
            digest.update(password.getBytes());
            return digest.digest();
        }
        catch (NoSuchAlgorithmException e){
            throw new IllegalArgumentException("Illegal algorithm value");
        }
    }

    public static byte[] encrypt(String password){
        try
        {
            MessageDigest digest = MessageDigest.getInstance("sha-1");
            digest.update(password.getBytes());
            return digest.digest();
        }
        catch (NoSuchAlgorithmException e){
        }
        return null;
    }

    public static String encryptAndEncode(String password)throws IllegalArgumentException{
        BASE64Encoder encoder = new BASE64Encoder();
        String encoded = encoder.encode(encrypt(password,"sha-1"));
        encoder = null;
        return encoded;
    }

    public static String encryptAndEncode(String password, String algorithm) throws IllegalArgumentException{
        BASE64Encoder encoder = new BASE64Encoder();
        String encoded = encoder.encode(encrypt(password, algorithm));
        encoder = null;
        return encoded;
    }
}
