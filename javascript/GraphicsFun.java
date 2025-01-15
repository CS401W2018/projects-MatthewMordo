
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class GraphicsFun extends JPanel {
    
    @Override
    public void paintComponent(Graphics g){
        g.drawString("Hello CS202!", 10, 10);
        g.drawString("Miss Mink23", 10, 30);
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
