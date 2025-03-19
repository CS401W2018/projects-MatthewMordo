package FInalProject;

import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Point;

public class Weed extends Flower {
    private ImageIcon image;
    private Point pos;

    // Constructor
    public Weed(Point pos) {
        super(pos); // Explicitly call the Flower constructor with a Point parameter
        this.pos = pos;
        image = new ImageIcon("javascript\\FInalProject\\weed-1.png"); // Always uses weed image
    }

    // Draw method
    public void draw(Graphics g) {
        if (image != null) {
            g.drawImage(image.getImage(), pos.x, pos.y, null);
        } else {
            g.drawString("Weed", pos.x, pos.y);
        }
    }
}