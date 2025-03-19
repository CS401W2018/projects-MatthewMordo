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