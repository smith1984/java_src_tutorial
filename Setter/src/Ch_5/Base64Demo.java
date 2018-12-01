package Ch_5;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Created by ito on 21.03.17.
 */
public class Base64Demo {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Не введен аргумент для шифрования");
            System.exit(1);
        }
        String text = args[0];
        BASE64Encoder enc = new BASE64Encoder();
        String encoder = enc.encode(text.getBytes());
        enc = null;

        String decoded = null;
        try {
            BASE64Decoder dec = new BASE64Decoder();
            decoded = new String(dec.decodeBuffer(encoder));
            dec = null;
        }
        catch (IOException exc) {
            exc.printStackTrace();
        }
        System.out.println("Закодираванно: " + encoder);
        System.out.println("Декодиравано: " + decoded);

    }
}
