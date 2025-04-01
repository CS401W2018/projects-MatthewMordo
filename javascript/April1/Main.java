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

        Point point = new Point();

        point = switch (e.getKeyCode()){
            case KeyEvent.VK_RIGHT -> new Point(nCloud.getX() + 100, nCloud.getY());
        }

        // Arrow key code = 39

        int i = 0;
        switch(e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                point.x = nCloud.getX() + 100;
                point.y = nCloud.getY();
                i++;
                break;
            case KeyEvent.VK_LEFT:
                point.x = nCloud.getX() - 100;
                point.y = nCloud.getY();
                i++;
                break;
            case KeyEvent.VK_UP:
                point.x = nCloud.getX();
                point.y = nCloud.getY() - 100;
                i++;
                break;
            case KeyEvent.VK_DOWN:
                point.x = nCloud.getX();
                point.y = nCloud.getY() + 100;
                i++;
                break;
            default:
                point.x = nCloud.getX();
                point.y = nCloud.getY();
                i++;
        }

        System.out.println("I am here: " + i);

        nCloud.move(point);
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}