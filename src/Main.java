import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main{
    public static void main(String[] args)
    {
        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);

        //DrawPanel myPanel = new DrawPanel(Color.orange);
        BallPanel bPanel = new BallPanel(Color.ORANGE);
        bPanel.setFocusable(true);



        myFrame.add(bPanel);
        myFrame.setVisible(true);



    }
}