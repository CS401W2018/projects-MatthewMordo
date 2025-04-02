package April1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Main extends JPanel implements KeyListener {

    private Cloud nCloud, cloud2, cloud3;
    private Mountain mountain;
    private Sun sun;

    private ArrayList<Shape> shapes = new ArrayList<>();

    public Main() {
        addKeyListener(this);
        nCloud = new Cloud(25, 200, "Cloud");
        cloud2 = new Cloud(50,50, "Cloud 1");
        cloud3 = new Cloud(0,100, "Cloud 2");

        System.out.println(nCloud.toString());
        System.out.println(cloud2.toString());
        System.out.println(cloud3.toString());

        mountain = new Mountain(100, 300, 300, 300);

        if (nCloud.equals(cloud3)) {
            System.out.println("We are one");
        } else {
            System.out.println("Divided we fall");
        }

        //Mountain
        mountain.setColor(Season.WINTER);

        //Sun
        sun = new Sun(400, 10);

        shapes.add(mountain);
        shapes.add(sun);
        shapes.add(nCloud);
        shapes.add(cloud2);
        shapes.add(cloud3);
    }

    @Override
    public void paintComponent(Graphics g) {
        requestFocusInWindow();
        mountain.setHeight(getHeight() /2 );
        mountain.setY(getHeight() / 2);
        sun.setX(getWidth() - 200);

        //Background
        g.setColor(Color.BLUE);
        g.fillRect(0,0,getWidth(), getHeight());

        for (Shape e : shapes) {
            e.setGraphics(g);
            display(e);
        }

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

    private void display(Shape s) {
        s.draw();
        s.speak();
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Main());
        window.setVisible(true);
        window.setSize(600,600);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("A Key was pressed!");
        System.out.println("Key Code: " + e.getKeyCode() + " key char: " + e.getKeyChar());
    
        // Move clouds with different distances
        for (Shape s : shapes) {
            if (s instanceof Cloud) {
                Cloud cloud = (Cloud) s;
    
                int moveDistance = 0;

                if (cloud == nCloud) {
                    moveDistance = 100;
                } else if (cloud == cloud2) {
                    moveDistance = 50;
                } else if (cloud == cloud3) {
                    moveDistance = 10;
                }

                Point point = switch (e.getKeyCode()) {
                    case KeyEvent.VK_RIGHT -> new Point(cloud.getX() + moveDistance, cloud.getY());
                    case KeyEvent.VK_LEFT -> new Point(cloud.getX() - moveDistance, cloud.getY());
                    case KeyEvent.VK_UP -> new Point(cloud.getX(), cloud.getY() - moveDistance);
                    case KeyEvent.VK_DOWN -> new Point(cloud.getX(), cloud.getY() + moveDistance);
                    default -> new Point(cloud.getX(), cloud.getY());
                };
    
                // Move the cloud
                cloud.move(point);
            }
        }
    
        repaint(); // Refresh the panel to reflect the movement
    }
    


    @Override
    public void keyReleased(KeyEvent e) {}
}