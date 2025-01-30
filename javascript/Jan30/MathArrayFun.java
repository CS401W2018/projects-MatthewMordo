package Jan30;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class MathArrayFun extends JPanel {

    // Declare studentNames as an instance variable
    String[] studentNames = {"Hanni", "Zoro", "Sanji", "Robin", "Luffy"}; 
    int [][] testScores = {
        {75,78,80},
        {88,89,86},
        {82,88,85},
        {95,94,98},
        {100,100,100},
        
    };  
    ImageIcon Hanni;
    
    public MathArrayFun(Graphics g){

        int y = 20;
        double average = 0;
        for (int i=0; i<5; i++){
             for (int j=0; j<3; j++){
                average += testScores[i][j];
                }
                g.drawString((studentNames[i] + " : " + average / 3),0,y);
                y+=20;
                average = 0;
        }


    }



    public static void main(String[] args) {
        var window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setContentPane(new MathArrayFun());
        window.setVisible(true);
    }
}
