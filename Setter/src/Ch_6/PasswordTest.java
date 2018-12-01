package Ch_6;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by ito on 21.03.17.
 */
public class PasswordTest {
    public static void main(String[] args) throws NoSuchAlgorithmException, IllegalAccessException {
        String pwd = "password";
        String  encrypted = new String(PasswordEncrypter.encrypt(pwd));
        String encoded = PasswordEncrypter.encryptAndEncode(pwd);
        System.out.print(encrypted);
        System.out.println();
        System.out.println(encoded);

        if(args.length == 0)
            return;
        String userEncrypt = new String(PasswordEncrypter.encrypt(args[0]));
        if (encrypted.compareTo(userEncrypt) == 0)
            System.out.println("Пароль введен верно");
        else
            System.out.println("Пароль введен не верно");

        MessageDigest d = MessageDigest.getInstance("sha-1");
        if(d.isEqual(encrypted.getBytes(), userEncrypt.getBytes()))
            System.out.println("Пароль введен верно");
        else
            System.out.println("Пароль введен не верно");
        PasswordComparer pwdC = new PasswordComparer(encrypted);
        if (pwdC.isEqual(args[0]))
            System.out.println("Пароль введен верно");
        else
            System.out.println("Пароль введен не верно");

    }
}
