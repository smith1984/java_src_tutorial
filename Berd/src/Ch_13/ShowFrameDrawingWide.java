package Ch_13;

import com.burdbrain.frames.ArtFrame;

class ShowFrameDrawingWide {

    public static void main(String args[]) {
        ArtFrame artFrame = new ArtFrame(new DrawingWide());

        artFrame.setSize(200, 100);
        artFrame.setVisible(true);
    }
}