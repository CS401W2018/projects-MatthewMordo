package Feb18;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class CoordinateDrawer extends JPanel {
    private int[][] grid = new int[200][200];

    public CoordinateDrawer(String filename) {
        loadCoordinates(filename);
    }

    private void loadCoordinates(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                markXShape(x, y);
            }
            System.out.println("Loaded: " + filename);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        }
    }

    private void markXShape(int x, int y) {
        int[][] offsets = {
                {0, 0},  // Center
                {-1, -1}, {-2, -2}, {-3, -3}, // Diagonals
                {-1, +1}, {-2, +2}, {-3, +3},
                {+1, -1}, {+2, -2}, {+3, -3},
                {+1, +1}, {+2, +2}, {+3, +3},
                {0, -1}, {0, 1},  // Above and below
                {-1, 0}, {1, 0}   // Left and right
        };

        for (int[] offset : offsets) {
            int newX = x + offset[0];
            int newY = y + offset[1];

            if (newX >= 0 && newX < 200 && newY >= 0 && newY < 200) {
                grid[newX][newY] = 1; // Set the pixel to 1
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Create a gradient background
        Color topColor = new Color(65, 7, 114); // Dark Purple
        Color bottomColor = new Color(184, 131, 227); // Light Purple

        for (int y = 0; y < 200; y++) {
            // Interpolate between the two colors
            float ratio = (float) y / 200;
            int r = (int) (topColor.getRed() * (1 - ratio) + bottomColor.getRed() * ratio);
            int gColor = (int) (topColor.getGreen() * (1 - ratio) + bottomColor.getGreen() * ratio);
            int b = (int) (topColor.getBlue() * (1 - ratio) + bottomColor.getBlue() * ratio);
            g.setColor(new Color(r, gColor, b));
            g.fillRect(0, y, 200, 1);
        }

        for (int x = 0; x < 200; x++) {
            for (int y = 0; y < 200; y++) {
                g.setColor(grid[x][y] == 1 ? Color.WHITE : new Color(0, 0, 0, 0)); // Transparent for empty pixels
                g.fillRect(x, y, 1, 1);
            }
        }
    }

    public static void main(String[] args) {
        // Prompt user for filename
        String filename = JOptionPane.showInputDialog("Enter the filename (e.g., spaceship.txt):");

        JFrame frame = new JFrame("Coordinates Visualizer");
        CoordinateDrawer panel = new CoordinateDrawer(filename);

        frame.add(panel);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
