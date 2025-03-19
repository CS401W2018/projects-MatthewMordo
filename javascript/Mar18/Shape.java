package Mar18;

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

    public abstract void draw(Graphics g);

    public abstract void speak(Graphics g);

}
