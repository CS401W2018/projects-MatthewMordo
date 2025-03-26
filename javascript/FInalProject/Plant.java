package FInalProject;

import java.awt.Graphics;
import java.awt.Point;
import javax.swing.ImageIcon;

public abstract class Plant {
    protected ImageIcon image; // Shared image field
    protected Point pos; // Position of the plant

    // Constructor
    public Plant(Point pos) {
        this.pos = pos;
    }

    // Draw method (shared between Flower and Weed)
    public void draw(Graphics g) {
        if (image != null) {
            g.drawImage(image.getImage(), pos.x, pos.y, null);
        } else {
            g.drawString(getClass().getSimpleName(), pos.x, pos.y);
        }
    }
}