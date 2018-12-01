package Ch_6;

import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

import javax.crypto.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by ito on 22.03.17.
 */
public class DesEncrypter {
    Cipher ecipher = null;
    Cipher dcipher = null;

    DesEncrypter (SecretKey key) {
        try {
            ecipher = Cipher.getInstance("DES");
            dcipher = Cipher.getInstance("DES");
            ecipher.init(Cipher.ENCRYPT_MODE, key);
            ecipher.init(Cipher.DECRYPT_MODE, key);
        }
        catch (NoSuchPaddingException nspe) {}
        catch (NoSuchAlgorithmException nsae) {}
        catch (InvalidKeyException ike) {}
    }
    public String encrypt (String str){
        try{
            byte[] utf8 = str.getBytes("UTF8");
            byte[] enc = ecipher.doFinal(utf8);
                System.out.print(enc.length);
            return new BASE64Encoder().encode(enc);
        }
        catch(UnsupportedEncodingException usee){}
        catch (BadPaddingException bpe){}
        catch (IllegalBlockSizeException ibse){}
        return null;
    }

    public String decrypt (String str){
        try{
            byte[] dec = new BASE64Decoder().decodeBuffer(str);
            byte[] utf8 = dcipher.doFinal(dec);
            return new String(utf8, "utf8");
        }
        catch (IOException ioe){}
        catch (BadPaddingException bpe){}
        catch (IllegalBlockSizeException ibse){}
        return null;
    }
}
