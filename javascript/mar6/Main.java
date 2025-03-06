package mar6;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

public class Main extends JPanel {
    private int x = 0;

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0,0,getWidth(), getHeight());


        Mountain mountain = new Mountain(100, getHeight() / 2, 300, getHeight() / 2);
        mountain.setColor(Season.SPRING);
        mountain.draw(g);

        System.out.println("mountain's X value: " + mountain.getX());
        mountain.setX(500);
        System.out.println("mountain's X after set value: " + mountain.getX());


        Cloud nCloud = new Cloud(25,200);
        nCloud.draw(g);
        nCloud.setNeighbor(new Cloud(25,100));


        Optional<Cloud> neighbor = nCloud.getNeighbor();
        if (neighbor.isPresent()) {
            neighbor.get().draw(g);
        } else {
            System.out.println("I'm all alone :'(");
        }

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Main());
        window.setVisible(true);
        window.setSize(600,600);
    }
}