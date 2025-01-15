import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class HaikuPoem extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){

        //Instead of a joke, I made a haiku about chasing a dangerous love
        g.drawString("Flames of Desire", 10, 10);
        g.drawString("Wild heart in pursuit,", 10, 35);
        g.drawString("chasing flames that scorch the soul,", 10, 45);
        g.drawString("love's edge cuts too deep.", 10, 55);
        
    }

    public static void main(String[] args) {
        System.out.println("HelloCS202!");

        JFrame window = new JFrame();

        //set window size
        window.setSize(200, 200);

        //tell program what to do when user clicks the x (close)
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //what to put inside the window
        window.setContentPane(new GraphicsFun());
        
        //make it visible
        window.setVisible(true);
    }
}