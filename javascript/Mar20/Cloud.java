import java.awt.*;
import java.util.Optional;

public class Cloud extends Shape {
    private Cloud neighbor;

    public Cloud(int x, int y) {
        super(x,y);
    }

    public Cloud(int x, int y, Color color) {
        super(x,y,color);
    }

    public Cloud(Cloud cloud) {
        super(cloud);
    }

    public Optional<Cloud> getNeighbor() {
        return Optional.ofNullable(neighbor);
    }
    public void setNeighbor(Cloud neighbor){
        this.neighbor = neighbor;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(this.x,y,width,height);
        g.fillOval(x + 75, y,width,height);
        g.fillOval(x + 150,y,width,height);
    }

    public void speak(Graphics g) {//Create a speak method that accepts a Graphics
        //creates a white box
        g.setColor(Color.WHITE);
        g.fillRect(x + 50, y - 30, 200, 30);

        //Puts text inside that white box "I'm just going to be floating by"
        g.setColor(Color.BLACK);
        g.drawString("I'm just going to be floating by", x + 60, y - 10);
    }
    // move the cloud to the right
    // draw the cloud
    public void move(Point point) {
        this.x = point.x;
        this.y = point.y;


    }

}
