package Mar4;

import java.awt.*;

//parent class
public class Shape {
    //protected so that all subclasses can access it.
    protected Color color;
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected int nField;


    public Shape(int x, int y) {
        this.width = 100;
        this.height = 100;
        color = Color.WHITE;

        this.x = x;
        this.y = y;
    }

    public Shape(int x, int y, Color color) {
        this(x, y);
        color = color;
    }

    public Shape(Shape cloud) {
        this(cloud.x, cloud.y+150, cloud.color);
    }

    public Color getRandomColor() {
        int red = (int) (Math.random() * 255 + 1);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);

        return new Color(red, green, blue);
    }

    public Shape (int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.drawString("you should have never come back",50,200);
    }

}
