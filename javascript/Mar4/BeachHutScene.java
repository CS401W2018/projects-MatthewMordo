package Mar4;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

// JPanel subclass that renders the beach scene
public class BeachHutScene extends JPanel {
    private BeachHut hut1; // First beach hut
    private BeachHut hut2; // Second beach hut

    // Constructor initializes both beach huts with different properties
    public BeachHutScene() {
        hut1 = new BeachHut(); // Default constructor
        hut2 = new BeachHut(400, 70); // Constructor with position parameters

        // Customizing hut2's colors
        hut2.setRoofColor(Color.GREEN);
        hut2.setWallColor(Color.YELLOW);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Sky
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, getWidth(), getHeight() / 2);

        // Clouds
        g.setColor(Color.WHITE);
        g.fillOval(50, 50, 100, 50);
        g.fillOval(90, 30, 120, 60);
        g.fillOval(130, 50, 100, 50);

        g.fillOval(300, 70, 120, 60);
        g.fillOval(340, 50, 100, 50);
        g.fillOval(380, 70, 120, 60);

        g.fillOval(450, 30, 100, 50);
        g.fillOval(480, 50, 120, 60);
        g.fillOval(520, 30, 100, 50);

        // Foliage
        g.setColor(Color.GREEN);
        g.fillArc(-100, 100, 300, 200, 0, 180);
        g.fillArc(50, 100, 300, 200, 0, 180);
        g.fillArc(200, 100, 300, 200, 0, 180);
        g.fillArc(350, 100, 300, 200, 0, 180);

        // Beach
        g.setColor(Color.YELLOW);
        g.fillRect(0, getHeight() / 2, getWidth(), getHeight() / 4);

        // Ocean with waves
        g.setColor(Color.BLUE);
        g.fillRect(0, getHeight() * 3 / 4, getWidth(), getHeight() / 4);
        g.setColor(Color.CYAN);
        for (int i = 0; i < getWidth(); i += 40) {
            g.fillOval(i, getHeight() * 3 / 4 - 10, 40, 20);
        }

        // Draw huts
        hut1.draw(g);
        hut2.draw(g);
    }

    public static void main(String[] args) {
        // Create a window to display the beach hut scene
        var window = new JFrame();
        window.setSize(600, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new BeachHutScene());
        window.setVisible(true);
    }
}
