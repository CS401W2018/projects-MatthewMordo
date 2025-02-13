import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

class MethodFunWidthHeight extends JPanel {

    private final int CORD_X;
    private final int CORD_Y;


    public MethodFunWidthHeight(){
        CORD_X = (int)(Math.random() * 300);
        CORD_Y = (int)(Math.random() * 300);
        System.out.println("CORD_X:" + CORD_X + "CORD_Y:" + CORD_Y);
    }

    public int getRandomX() {
        return (int)(Math.random() * getWidth());
    }

    public int getRandomY() {
        return (int)(Math.random() * getHeight());
    }

    public void drawRect(int width, int height, Color c, Graphics g) {
        g.setColor(c);
        g.fillRect(getRandomX(),getRandomY(),width,height);
    }

    public void drawRect(int x, int y, int width, int height, Color c, Graphics g){
        g.setColor(c);
        g.fillRect(x,y,width,height);
    }
    


    @Override
    public void paintComponent(Graphics g) {
        
        drawRect(50,60, Color.BLUE, g);
        drawRect(140,90, Color.RED, g);
        drawRect(500,60, Color.BLACK, g);
        
        drawRect(CORD_X, CORD_Y, 100,110,Color.YELLOW, g);

        




        System.out.println("We are done!");
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600,600);
        window.setContentPane(new MethodFunWidthHeight());
        window.setVisible(true);
    }
}