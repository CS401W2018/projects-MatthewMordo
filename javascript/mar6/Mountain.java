package mar6;

import java.awt.*;

public class Mountain extends Shape {

    public Mountain (int x, int y, int width, int height) {
        super(x,y,width,height);
        color = getRandomColor();
    }

    @Override
    public void draw(Graphics g) {
        int[] xPoints = {x, x + width / 2, x + width};
        int[] yPoints = {y + height, y,  y + height};
        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, 3);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setColor(String season) {
        if (Season.FALL.equals(season)) {
            color = Color.ORANGE;
        } else if (Season.WINTER.equals(season)) {
            color = Color.LIGHT_GRAY;
        } else if (Season.SPRING.equals(season)) {
            color = Color.GREEN;
        } else {
            color = Color.YELLOW;
        }
    }
}
