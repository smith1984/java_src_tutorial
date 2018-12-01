package Ch_6;

import javax.crypto.*;
import java.security.NoSuchAlgorithmException;

/**
 * Created by ito on 22.03.17.
 */
public class DesEncrypterDemo {
    public static void main(String[] args) {
        try{
            SecretKey key = KeyGenerator.getInstance("DES").generateKey();
            DesEncrypter encrypter = new DesEncrypter(key);
            String encrypted = encrypter.encrypt("проверка");
            System.out.println(encrypted);
            String decrypted = encrypter.decrypt(encrypted);
            System.out.println(decrypted);
        }
        catch (NoSuchAlgorithmException nsae){}
    }
}
