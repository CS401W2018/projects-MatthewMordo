package April1;

import javax.swing.*;
import java.awt.*;

public class Sun extends Shape {
    ImageIcon image;

    public Sun(int x, int y) {
        super(x, y);
        image = new ImageIcon("C:\\Users\\ledun\\OneDrive\\Documents\\BYU-Hawaii\\Github\\projects-MatthewMordo\\javascript\\April1\\Sun.png");
    }

    @Override
    public void draw() {
        image.paintIcon(null, this.g, this.x, this.y);
    }

    @Override
    public void speak() {
        //creates a white box
        g.setColor(Color.WHITE);
        g.fillRect(x + 50, y + image.getIconHeight(), 200, 30);

        //Puts text inside that white box "I'm just going to be floating by"
        g.setColor(Color.BLACK);
        g.drawString("Hot is the new cool", x + 60, y + image.getIconHeight() + 20);
    }


}
