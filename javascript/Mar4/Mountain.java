import java.awt.*;

public class Mountain {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Mountain(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        //color = this.getRandomColor();
    }
    //Create a method that will randomize the color of your mountain.
    //call the  new method inside the constructor using "this"

    public Color getRandomColor() {
        //Red Green Blue //255
        int red = (int) (Math.random() * 255 + 1);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);

        return new Color(red, green, blue);
    }

    public void draw(Graphics g) {
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
}
