import javax.swing.*;
import java.awt.*;
import java.util.Optional;

public class Main extends JPanel {
    private int x = 0;

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0,0,getWidth(), getHeight());

        /*Cloud cloud = new Cloud(50,50);
        Cloud cloud1 = new Cloud(300, 300);

        cloud.draw(g);
        cloud1.draw(g);

        Cloud cloudOverload = new Cloud(300, 50, Color.PINK);
        cloudOverload.draw(g);

        Cloud cloudCopy = new Cloud(cloudOverload);
        cloudCopy.draw(g);*/

        Mountain mountain = new Mountain(100, getHeight() / 2, 300, getHeight() / 2);
        mountain.setColor(Season.SPRING);
        mountain.draw(g);

        System.out.println("mountain's X value: " + mountain.getX());
        mountain.setX(500);
        System.out.println("mountain's X after set value: " + mountain.getX());

        //null -> represents nothing ... the absence of a value or reference (object reference)
        // it is not empty
        // it is not 0
        // it is not void
        // IT IS null

        Cloud nCloud = new Cloud(25,200);
        nCloud.draw(g);
        nCloud.setNeighbor(new Cloud(25,100));
        //set the neighbor here
        //nCloud.getNeighbor().draw(g);

        Optional<Cloud> neighbor = nCloud.getNeighbor();
        if (neighbor.isPresent()) {
            neighbor.get().draw(g);
        } else {
            System.out.println("I'm all alone :'(");
        }
/*
        if (nCloud == null) {
            nCloud = new Cloud(25,200);
        }

        nCloud.draw(g);*/
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Main());
        window.setVisible(true);
        window.setSize(600,600);
    }
}