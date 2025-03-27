import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;
import java.util.ArrayList;

public class Main extends JPanel implements KeyListener {

    private Cloud nCloud, cloud2, cloud3;
    private Mounain mountain;
    Private Sun sun;
    //private Cloud cloud2;
    //private Cloud cloud3;

    private ArrayList<Shape> shapes = new ArrayList<>();

    public Main() {
        addKeyListener(this);
        nCloud = new Cloud(25, 200);
        cloud2 = new Cloud(50,50);
        cloud3 = new Cloud(0,100);
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


        //Sun
        Sun sun = new Sun(getWidth() - 200, 10);

        shapes.add(sun);
        shapes.add(mountain);
        shapes.add(nCloud);
        shapes.add(cloud2);
        shapes.add(cloud3);

        /*display(nCloud, g);
        display(cloud2, g);
        display(cloud3, g);
        display(mountain, g);
        display(sun, g);*/

        for (Shape e : shapes) {
            e.setGraphics(g);
            display(e);
        }

        //Shape e = new Sun(0, 0);

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

    /*private void display(Cloud c, Graphics g) {
        c.draw(g);
        c.speak(g);
    }

    private void display(Mountain m, Graphics g) {
        m.draw(g);
        m.speak(g);
    }

    private void display(Sun s, Graphics g) {
        s.draw(g);
        s.speak(g);
    }*/

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
        // Arrow key code = 39

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            //move it 100
            point.x = nCloud.getX() + 100;
            point.y = nCloud.getY();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            point.x = nCloud.getX() - 100;
            point.y = nCloud.getY();
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            point.x = nCloud.getX();
            point.y = nCloud.getY() - 100;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            point.x = nCloud.getX();
            point.y = nCloud.getY() + 100;
        } else {
            point.x = nCloud.getX();
            point.y = nCloud.getY();
        }

        nCloud.move(point);
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}