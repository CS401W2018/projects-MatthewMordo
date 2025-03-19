package FInalProject;

import java.awt.Graphics;
import java.awt.Point;
import javax.swing.ImageIcon;
import java.util.Random;

public class Flower {
    private ImageIcon image;
    private Point pos;

    // Constructor
    public Flower(Point pos) {
        this.pos = pos;
        // Randomly select an image for the flower
        String[] images = {"javascript\\FInalProject\\flower0-1.png", "javascript\\FInalProject\\flower1-1.png", "javascript\\FInalProject\\flower2-1.png", "javascript\\FInalProject\\flower3-1.png"};
        Random rand = new Random();
        image = new ImageIcon(images[rand.nextInt(images.length)]);
    }

    // Draw method
    public void draw(Graphics g) {
        if (image != null) {
            g.drawImage(image.getImage(), pos.x, pos.y, null);
        } else {
            g.drawString("Flower", pos.x, pos.y);
        }
    }
}
