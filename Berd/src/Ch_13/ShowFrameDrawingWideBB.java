package Ch_13;

import com.burdbrain.drawings.DrawingWideBB;
import com.burdbrain.frames.ArtFrame;

/**
 * Created by ito on 28.03.17.
 */
public class ShowFrameDrawingWideBB {
    public static void main(String args[]) {
        ArtFrame artFrame = new ArtFrame(new DrawingWideBB());

        artFrame.setSize(200, 100);
        artFrame.setVisible(true);
    }
}
