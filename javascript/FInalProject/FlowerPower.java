package FInalProject;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class FlowerPower extends JPanel {
    private Garden garden; // The garden instance
    private final int gardenHeight = 300; // Fixed garden height
    private final int skyHeight = 300; // The rest will be sky

    // Constructor
    public FlowerPower() {
        garden = new Garden(); // Instantiate the garden
    }

    // Paint the component (draw the background and the garden)
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int width = getWidth();  // Window width (adjusts when resized)
        int height = getHeight(); // Window height (adjusts when resized)

        // Sky should always fill the top half
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, width, skyHeight); // Sky - dynamic width, fixed height

        // Grass should always fill the bottom half
        g.setColor(Color.GREEN);
        g.fillRect(0, skyHeight, width, height - skyHeight); // Grass - dynamic width, but remains below the sky

        // Draw the sun in the top-left corner
        g.setColor(Color.YELLOW);
        g.fillOval(30, 30, 100, 100); // Adjust size and position as needed

        // Draw birds in the sky - Commodore 64 style
        g.setColor(Color.BLACK); // Birds are black

        // First bird
        int bird1X = 250; // X position
        int bird1Y = 80;  // Y position
        g.drawLine(bird1X, bird1Y, bird1X + 10, bird1Y - 5); // Left wing
        g.drawLine(bird1X + 10, bird1Y - 5, bird1X + 20, bird1Y); // Right wing

        // Second bird (offset)
        int bird2X = 300;
        int bird2Y = 90;
        g.drawLine(bird2X, bird2Y, bird2X + 10, bird2Y - 5); // Left wing
        g.drawLine(bird2X + 10, bird2Y - 5, bird2X + 20, bird2Y); // Right wing

        // Draw the garden **only if there's enough space**
        if (height >= gardenHeight) {
            garden.draw(g);
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flower Power");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new FlowerPower());
        frame.setSize(800, 600); // Set the window size
        frame.setVisible(true);
    }
}