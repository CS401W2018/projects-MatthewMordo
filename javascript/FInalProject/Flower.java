package FInalProject;

import java.awt.Point;
import java.util.Random;
import javax.swing.ImageIcon;

public class Flower extends Plant {
    // Constructor: Calls super and assigns a random flower image
    public Flower(Point pos) {
        super(pos);
        String[] images = {"javascript\\FInalProject\\flower0-1.png", "javascript\\FInalProject\\flower1-1.png", "javascript\\FInalProject\\flower2-1.png", "javascript\\FInalProject\\flower3-1.png"};
        Random rand = new Random();
        image = new ImageIcon(images[rand.nextInt(images.length)]);
    }
}
