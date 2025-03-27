import java.awt.*;
/*
* Object -> Graphics -> Shape -> Mountain -> Hill -> Flat mountain
*
* */
//Parent Class
public abstract class Shape {
    //"protected" so all subclasses can access the fields
    protected Color color;
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected Graphics g;
    private int nField;

    //Execute before constructors, only run once can not be called else where
    //Initialization Block
    {
        width = 100;
        height = 100;
    }

    public Shape(int x, int y) {
        color = Color.WHITE;
        this.x = x;
        this.y = y;
    }

    public Shape(int x, int y, Color color) {
        this(x, y);
        this.color = color;
    }

    public Shape(Shape cloud) {
        this(cloud.x, cloud.y+150, cloud.color);
    }

    public Shape(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public abstract void draw();
    public abstract void speak();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setGraphics(Graphics g) {
        this.g = g;
    }

    //generate setX and setY methods
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    //generate setHeight only
    public void setHeight(int height) {
        this.height = height;
    }
}
