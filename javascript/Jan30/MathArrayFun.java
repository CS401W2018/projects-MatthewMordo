package Jan30;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class MathArrayFun extends JPanel {

    // Declare student names and test scores as instance variables
    String[] studentNames = {"Hanni", "Zoro", "Sanji", "Robin", "Luffy"};
    int[][] testScores = {
        {75, 78, 80},
        {88, 89, 86},
        {82, 88, 85},
        {95, 94, 98},
        {100, 100, 100},
    };

    
    ImageIcon hanniImage;

    public MathArrayFun() {
        
        hanniImage = new ImageIcon("C:\\Users\\User1\\Downloads\\projects-MatthewMordo\\javascript\\Jan30\\hanni.jpg");  
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  

        int y = 20;  
        double average;

        
        for (int i = 0; i < studentNames.length; i++) {
            average = 0;  

            
            for (int j = 0; j < testScores[i].length; j++) {
                average += testScores[i][j];
            }
            average /= testScores[i].length;  

            
            g.drawString(studentNames[i] + " : " + average, 10, y);

            
            if (studentNames[i].equals("Hanni")) {
                g.drawImage(hanniImage.getImage(), 200, y - 10, this);  
                y += hanniImage.getIconHeight();  
            }

            y += 20;  
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
