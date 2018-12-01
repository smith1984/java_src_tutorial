package Ch_14;

import java.io.*;

public class Box_ implements Serializable {
    private int width;
    private int height;

    public void setWidth(int w){
        width = w;
    }

    public void setHeight(int h){
        height = h;
    }

    public static void main(String[] arg){
        Box_ box = new Box_();
        box.setHeight(20);
        box.setWidth(50);

        try {
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(box);
            os.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
