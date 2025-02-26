import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class CoordinatesVisualizer extends JPanel {
    private int[][] grid = new int[200][200];

    public CoordinatesVisualizer(String filename) {
        loadCoordinates(filename);
    }

    private void loadCoordinates(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                markXShape(x, y);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        }
    }

    private void markXShape(int x, int y) {
        int[][] offsets = {
                {0, 0},  {-1, -1}, {-2, -2}, {-3, -3},
                {-1, +1}, {-2, +2}, {-3, +3},
                {+1, -1}, {+2, -2}, {+3, -3},
                {+1, +1}, {+2, +2}, {+3, +3}
        };

        for (int[] offset : offsets) {
            int newX = x + offset[0];
            int newY = y + offset[1];

            if (newX >= 0 && newX < 200 && newY >= 0 && newY < 200) {
                grid[newX][newY] = 1;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int x = 0; x < 200; x++) {
            for (int y = 0; y < 200; y++) {
                g.setColor(grid[x][y] == 1 ? Color.WHITE : Color.BLACK);
                g.fillRect(x, y, 1, 1);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Coordinates Visualizer");
        CoordinatesVisualizer panel = new CoordinatesVisualizer("coordinates.txt");
        frame.add(panel);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
