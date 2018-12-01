package Ch_11;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by ito on 31.03.17.
 */
public class Font {
    public static void main(String[] args) {
        String[] str = Toolkit.getDefaultToolkit().getFontList();
        for(String s:str)
            System.out.println(s);
        str = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(String s:str)
            System.out.println(s);
    }
}
