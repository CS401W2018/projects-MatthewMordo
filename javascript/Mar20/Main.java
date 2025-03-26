import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JPanel implements KeyListener{

    private Cloud nCloud;

    public Main(){
        addKeyListener(this);
        nCloud = new Cloud(25,200);

    }

    @Override
    public void paintComponent(Graphics g) {

        requestFocusInWindow();

        //Background
        g.setColor(Color.BLUE);
        g.fillRect(0,0,getWidth(), getHeight());

        //Mountain
        Mountain mountain = new Mountain(100, getHeight() / 2, 300, getHeight() / 2);
        mountain.setColor(Season.WINTER);
        mountain.draw(g);

        //Cloud
        
        

        //Sun
        Sun sun = new Sun(getWidth() - 200, 10);
        sun.draw(g);
        nCloud.draw(g);

        nCloud.speak(g);
        mountain.speak(g);
        sun.speak(g);

        /*Shape shape = new Shape(10,10);
        shape.draw(g);*/


        //Tree
        g.setColor(new Color(139,69,19));
        int treeHeight = 100;
        int yTree = getHeight() - treeHeight;
        g.fillRect(450, yTree, 20 , treeHeight);

        g.setColor(Color.GREEN);
        g.fillOval(400, yTree - 30, 100, 60);
        g.fillOval(425, yTree - 30, 100, 60);
        g.fillOval(415, yTree -50, 100, 60);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Main());
        window.setVisible(true);
        window.setSize(600,600);
    }

    @Override
    public void keyTyped(KeyEvent e){

    }

    @Override
    public void keyPressed(KeyEvent e){
        System.out.println("A key was pressed");
        System.out.println("key code: " + e.getKeyCode() + " key char: " + e.getKeyChar());
        // Arrow keys code = 39

        Point point = new Point();


        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            // Move the cloud to the right 100 pixels
            point.x = nCloud.getX() + 100;
            point.y = nCloud.getY();
            nCloud.move(point);
            
        }
    
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            // Move the cloud to the left 100 pixels
            point.x = nCloud.getX() - 100;
            point.y = nCloud.getY(); 
            nCloud.move(point);
            
        }
    
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            // Move the cloud up 100 pixels
            point.x = nCloud.getX();
            point.y = nCloud.getY() - 100;
            nCloud.move(point);
            
        }
    
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            // Move the cloud down 100 pixels
            point.x = nCloud.getX();
            point.y = nCloud.getY() + 100;
            nCloud.move(point);
            
        } else{
            point.x = nCloud.getX();
            point.y = nCloud.getY();
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e){

    }

}