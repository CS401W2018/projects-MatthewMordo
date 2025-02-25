package Feb25.CloudFun.src;

import java.awt.*;

public class Cloud {
    private Color c;
    private int x;
    private int yCord;
    private int width;
    private int height;

    public Cloud(int x, int y) {
        width = 100;
        height = 100;
        c = Color.WHITE;

        this.x = x;
        yCord = y;
    }

    public Cloud(int x, int y, Color color) {
        this(x, y);
        c = color;
    }

    public Cloud(Cloud cloud) {
        this(cloud.x, cloud.yCord+150, cloud.c);
    }

    public void draw(Graphics g){
        g.setColor(c);
        g.fillOval(this.x,yCord,width,height);
        g.fillOval(x + 75, yCord,width,height);
        g.fillOval(x + 150,yCord,width,height);
    }
}
