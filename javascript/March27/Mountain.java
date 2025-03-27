import java.awt.*;

public class Mountain extends Shape {

    public Mountain(int x, int y, int width, int height) {
        super(x, y, width, height);
        color = getRandomColor();
    }

    public Color getRandomColor() {
        //Red Green Blue //255
        int red = (int) (Math.random() * 255 + 1);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);

        return new Color(red, green, blue);
    }

    @Override
    public void draw() {
        int[] xPoints = {x, x + width / 2, x + width};
        int[] yPoints = {y + height,
                y,  y + height};
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

    @Override
    public void speak() {//Create a speak method that accepts a Graphics
        //creates a white box
        g.setColor(Color.YELLOW);
        g.fillRect(x + 50, y - 30, 200, 30);

        //Puts text inside that white box "I'm just going to be floating by"
        g.setColor(Color.BLACK);
        g.drawString("Standing still and true", x + 60, y - 10);
    }

    public void rain() {

    }
}
