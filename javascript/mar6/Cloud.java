package mar6;

import java.awt.*;
import java.util.Optional;

public class Cloud extends Shape{

    private Cloud neighbor;

    public Cloud(int x, int y) {
        super(x,y);
    }

    public Cloud(int x, int y, Color color) {
        super(x, y, color);
    }

    public Cloud(Cloud cloud) {
        super(cloud);
    }

    public Optional<Cloud> getNeighbor() {
        return Optional.ofNullable(neighbor);
    }

    public void setNeighbor(Cloud neighbor) {
        this.neighbor = neighbor;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(this.x,y,width,height);
        g.fillOval(x + 75, y,width,height);
        g.fillOval(x + 150,y,width,height);
    }
}
