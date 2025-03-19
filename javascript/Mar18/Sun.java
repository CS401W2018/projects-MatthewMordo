package Mar18;

import mar6.override;

import javax.swing.*;
import java.awt.*;

public class Sun extends Shape{

    ImageIcon image;

    public Sun(int x, int y){
        super(x, y);
        image = new ImageIcon("Sun.png");
    }

    @override
    public void draw(Graphics g){
        image.paintIcon(null,g,x,y);
    }

    @override
    public void speak(Graphics g){

        g.setColor(Color.WHITE);
        g.fillRect(x + 50, y + image.getIconHeight(),200,100);

        g.setColor(Color.BLACK);
        g.drawString("Hot is the new cool",x + 60, y + image.getIconHeight() + 20);
    }

}
