import java.awt.*;
import javax.swing.*;

public class Main{
    public static void main(String[] args)
    {
        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);
        //DrawPanel myPanel = new DrawPanel(Color.orange);
        BallPanel bPanel = new BallPanel(Color.ORANGE);
        myFrame.add(bPanel);
        myFrame.setVisible(true);



    }
}