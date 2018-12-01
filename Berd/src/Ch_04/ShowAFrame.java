package Ch_04;

import javax.swing.JFrame;

class ShowAFrame {

    public static void main(String args[]) {
        JFrame myFrame = new JFrame();
        String myTitle = "Blank Frame";

        myFrame.setTitle(myTitle);
        myFrame.setSize(300, 200);
        myFrame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}