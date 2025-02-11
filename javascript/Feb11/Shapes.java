package Feb11;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

class Shapes extends JPanel {

    public void drawControllers(Color c, int x, int y, Graphics g){

        g.setColor(c);
        g.fillOval(x, y, 150, 200);

        
    }

    public void drawSwitch(Graphics g, int x, int y){

        drawControllers(Color.RED, x+225, y, g);
        drawControllers(Color.BLUE, x-65, y, g);
        
        
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 300, 200);

    }

    @Override
    public void paintComponent(Graphics g) {   
        drawSwitch(g, 100, 100);
        drawSwitch(g, 200, 400);
        drawSwitch(g, 400, 100);
    }

    public static void main(String[] args) {
        //create a new window
        var window = new JFrame();

        //set the windows size to 200 pixels wide, 200 pixels high
        window.setSize(500,500);

        //close the app when the user closes the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* make the LO class responsible for the contents of our window */
        window.setContentPane(new Shapes());

        //turn the window on
        window.setVisible(true);

    }
}