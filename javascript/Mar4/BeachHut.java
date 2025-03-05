package Mar4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

// Class representing a Beach Hut with position and customizable colors
public class BeachHut {
    private Point pos; // Position of the hut on the screen
    private Color roofColor; // Color of the roof
    private Color wallColor; // Color of the walls
    private int wallHeight; // Height of the hut's walls

    // Default constructor - initializes hut at a default position with preset colors
    public BeachHut() {
        this(220, 70, 150, Color.ORANGE, Color.MAGENTA);
    }

    // Constructor with position parameters
    public BeachHut(int x, int y) {
        this(x, y, 150, Color.RED, Color.BLUE);
    }

    // Constructor with full parameters
    public BeachHut(int x, int y, int wallHeight, Color roofColor, Color wallColor) {
        this.pos = new Point(x, y);
        this.wallHeight = wallHeight;
        this.roofColor = roofColor;
        this.wallColor = wallColor;
    }

    // Sets the roof color
    public void setRoofColor(Color c) {
        this.roofColor = c;
    }

    // Sets the wall color
    public void setWallColor(Color c) {
        this.wallColor = c;
    }

    // Sets the wall height
    public void setWallHeight(int height) {
        this.wallHeight = height;
    }

    // Draws the Beach Hut with its current position and color settings
    public void draw(Graphics g) {
        g.setColor(wallColor);
        g.fillRect(pos.x, pos.y, 150, wallHeight);
        
        g.setColor(roofColor);
        g.fillRect(pos.x - 30, pos.y - 30, 220, 20);
        g.fillRect(pos.x - 10, pos.y - 10, 180, 20);
        g.fillRect(pos.x - 20, pos.y - 20, 200, 20);

        // Door
        g.setColor(Color.BLACK);
        g.fillRect(pos.x + 50, pos.y + 70, 40, 80);
        
        // Window
        g.fillRect(pos.x + 80, pos.y + 20, 20, 20);
    }
}

