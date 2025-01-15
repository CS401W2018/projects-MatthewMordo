import javax.swing.*;
import java.awt.*;

public class DrawRectExample extends JPanel {
    // Override the paintComponent method to draw the rectangle
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Ensure the panel is properly rendered

        // Set the color to draw the rectangle
        g.setColor(Color.RED);

        // Draw a rectangle at position (50, 50) with width 200 and height 100
        g.drawRect(50, 50, 200, 100);
    }

    public static void main(String[] args) {
        // Create a JFrame to hold the drawing panel
        JFrame frame = new JFrame("Draw Rectangle Example");
        DrawRectExample panel = new DrawRectExample();

        // Set the frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // Set the size of the window
        frame.add(panel); // Add the panel to the frame
        frame.setVisible(true); // Make the frame visible
    }
}
