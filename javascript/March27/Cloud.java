import java.awt.*;
import java.util.Optional;

public class Cloud extends Shape {
    private Cloud neighbor;
    public static String name;

    public Cloud(int x, int y, String name) {
        super(x,y);
        Cloud.name = name;
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
    public void draw(){
        g.setColor(color);
        g.fillOval(this.x,y,width,height);
        g.fillOval(x + 75, y,width,height);
        g.fillOval(x + 150,y,width,height);
    }

    @Override
    public void speak() {//Create a speak method that accepts a Graphics
        //creates a white box
        g.setColor(Color.WHITE);
        g.fillRect(x + 50, y - 30, 200, 30);

        //Puts text inside that white box "I'm just going to be floating by"
        g.setColor(Color.BLACK);
        g.drawString("I'm just going to be floating by", x + 60, y - 10);
    }

    //move the cloud
    // draw the cloud again?
    public void move(Point point) {
        //this.x = this.x + x;
        this.x = point.x;
        this.y = point.y;

    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Cloud) {
            Cloud other = (Cloud) obj;
        if (this.name.equals(other.name)) {
            return true;
        }
        
        }
        return false;
    }
}
