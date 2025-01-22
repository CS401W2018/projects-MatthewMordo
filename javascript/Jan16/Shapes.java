package Jan16;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Shapes extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){

        int changeY = 300;
        int changeX = 0;


        // left Joycon
        g.setColor(Color.RED);
        g.fillOval(50 + changeX, 50 + changeY, 100, 200);

        // Right Joycon
        g.setColor(Color.BLUE);
        g.fillOval(350 + changeX, 50 + changeY, 100, 200);

        //bezels
        g.setColor(Color.BLACK);
        g.drawRect(100 + changeX, 50 + changeY, 300, 200);
        g.fillRect(100 + changeX, 50 + changeY, 300, 200);

        //screen
        g.setColor(Color.WHITE);
        g.drawRect(150 + changeX, 100 + changeY, 200, 100);
        g.fillRect(150 + changeX, 100 + changeY, 200, 100);
    }

    public static void main(String[] args) {
        
        var window = new JFrame();
        window.setSize(500,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Shapes());
        window.setVisible(true);


    }
}
