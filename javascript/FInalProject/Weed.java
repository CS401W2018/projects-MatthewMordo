package FInalProject;

import java.awt.Point;
import javax.swing.ImageIcon;

public class Weed extends Plant {
    // Constructor: Calls super and assigns the weed image
    public Weed(Point pos) {
        super(pos);
        image = new ImageIcon("javascript\\FInalProject\\weed-1.png");
    }
}
