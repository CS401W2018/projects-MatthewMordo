package Feb25;

import java.awt.*;
import java.util.Random;

public class Mountain {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public  Mountain(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = randomizeColor();
    }

    private Color randomizeColor() {
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        return new Color(r,g,b);
    }

    public void draw (Graphics g){

        int[] xPoints = {x,x + width / 2, x + width };
        int[] yPoints = {y + height, y , y + height};
        g.setColor(color);
        g.fillPolygon(xPoints,yPoints,3);

    }
}
