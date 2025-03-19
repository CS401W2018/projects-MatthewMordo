package Mar18;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

public class Main extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        //Background
        g.setColor(Color.BLUE);
        g.fillRect(0,0,getWidth(), getHeight());

        //Mountain
        Mountain mountain = new Mountain(100, getHeight() / 2, 300, getHeight() / 2);
        mountain.setColor(Season.WINTER);
        mountain.draw(g);

        //Cloud
        Cloud nCloud = new Cloud(25,200);
        nCloud.draw(g);



        //Sun
        Sun sun = new Sun(getWidth() - 200, 10);
        sun.draw(g);


        nCloud.speak(g);
        mountain.speak(g);
        sun.speak(g);


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
}