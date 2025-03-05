package Feb27;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

public class Main extends JPanel {
    private int x = 0;

    // Declare nCloud as an instance variable
    private Cloud nCloud;

    public void setCloud(Cloud cloud) {
        this.nCloud = cloud;
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Fixed the import for Mountain class
        Mountain mountain = new Mountain(100, getHeight() / 2, 300, getHeight() / 2);
        mountain.setColor(Season.SUMMER);
        mountain.draw(g);

        System.out.println("mountain's X value: " + mountain.getX());
        mountain.setX(500);
        System.out.println("mountain's X after set value: " + mountain.getX());

        Cloud nCloud = new Cloud(25,200);
        nCloud.draw(g);
        nCloud.setNeighbor(new Cloud(25,100));


        Optional<Cloud> neighbor = nCloud.getNeighbor();
        if(neighbor.isPresent()){
            neighbor.get().draw(g);
        } else{
            System.out.println("I am all alone");
        }


        // Check if nCloud is null, then initialize it
        if (nCloud == null) {
            nCloud = new Cloud(25, 25);
        }
        nCloud.draw(g);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Main());
        window.setVisible(true);
        window.setSize(600, 600);
    }
}
