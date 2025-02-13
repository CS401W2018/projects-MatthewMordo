package Feb12;

import javax.swing.*;
import java.awt.*;

public class USFlag extends JPanel {
    private int stripeCount;
    private int starRows;
    private int starCols;

    public USFlag(int stripeCount, int starRows, int starCols) {
        this.stripeCount = stripeCount;
        this.starRows = starRows;
        this.starCols = starCols;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        
        int stripeHeight = panelHeight / stripeCount;
        
        // Draw stripes
        for (int i = 0; i < stripeCount; i++) {
            if (i % 2 == 0) {
                g.setColor(Color.RED);
                g.fillRect(0, i * stripeHeight, panelWidth, stripeHeight);
            }
        }
        
        // Blue box (Union)
        int unionHeight = stripeHeight * 7;
        int unionWidth = (int) (panelWidth * 0.4);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, unionWidth, unionHeight);
        
        // Draw white stars (ovals)
        g.setColor(Color.WHITE);
        int starSize = Math.min(unionWidth / (starCols + 1), unionHeight / (starRows + 1));
        
        for (int row = 0; row < starRows; row++) {
            for (int col = 0; col < starCols; col++) {
                int x = (col + 1) * unionWidth / (starCols + 1) - starSize / 2;
                int y = (row + 1) * unionHeight / (starRows + 1) - starSize / 2;
                g.fillOval(x, y, starSize, starSize);
            }
        }
    }
    
    public static void main(String[] args) {
        int stripeCount = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of stripes:"));
        int starRows = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of star rows:"));
        int starCols = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of star columns:"));
        
        JFrame frame = new JFrame("U.S. Flag");
        USFlag flagPanel = new USFlag(stripeCount, starRows, starCols);
        
        frame.add(flagPanel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}   