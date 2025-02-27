package Feb25;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    private int x = 0;

    @Override
    public void paintComponent(Graphics g) {


        g.setColor(Color.BLUE);
        g.fillRect(0,0,getWidth(), getHeight());

        Cloud cloud = new Cloud(50,50);
        Cloud cloud1 = new Cloud(300, 300);

        cloud.draw(g);
        cloud1.draw(g);

        Cloud cloudOverload = new Cloud(300, 50, Color.PINK);
        cloudOverload.draw(g);

        Cloud cloudCopy = new Cloud(cloudOverload);
        cloudCopy.draw(g);

        Mountain mountain = new Mountain(100, getHeight() / 2, 300, getHeight() / 2);
        mountain.draw(g);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Main());
        window.setVisible(true);
        window.setSize(600,600);
    }
}