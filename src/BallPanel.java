import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class BallPanel extends JPanel{
    private Color theColor;
    ArrayList<Ball> ballArray = new ArrayList<Ball>();
    int x = 80;
    int y = 20;
    int speedX = 3;
    int speedY = 3;

    Ball oneBall;


    public BallPanel(Color e)
    {

        JButton addButton = new JButton();
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ballArray.add(new Ball());
            }
        });
        this.add(addButton);

        theColor = e;
        setBackground(theColor);
        for(int i = 0; i < 20; i++)
        {
            ballArray.add(new Ball());
        }
        oneBall = new Ball(20,20,20,5,5);
        this.setFocusable(true);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                System.out.println(key);
                if (key == KeyEvent.VK_W) {
                    oneBall.moveUp();
                }
                if (key == KeyEvent.VK_D) {
                    oneBall.moveRight();
                }
                if (key == KeyEvent.VK_A) {
                    oneBall.moveLeft();
                }
                if (key == KeyEvent.VK_S) {
                    oneBall.moveDown();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }


        });
    }

    @Override
    protected void paintComponent(Graphics g)
    {

        super.paintComponent(g);

        //super means that you still have methods of original class but you add your method to that list
        oneBall.teleport(this);
        oneBall.drawSpecialBall(g);


        for(Ball b : ballArray)
        {
            b.move(this);
            b.drawBall(g);
        }
        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }
        repaint();
        //fillOval(x,y,width,height)
    }


}