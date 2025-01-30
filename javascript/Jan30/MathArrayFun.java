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

    // Declare an ImageIcon for Hanni's picture
    ImageIcon hanniImage;

    public MathArrayFun() {
        // Load Hanni's image in the constructor
        hanniImage = new ImageIcon("hanni.png");  // Make sure the file exists in the correct path
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // Call the superclass's paintComponent method

        int y = 20;  // Initial vertical position for drawing
        double average;

        // Loop through each student
        for (int i = 0; i < studentNames.length; i++) {
            average = 0;  // Reset the average for each student

            // Calculate the average score for the current student
            for (int j = 0; j < testScores[i].length; j++) {
                average += testScores[i][j];
            }
            average /= testScores[i].length;  // Get the average score for the student

            // Draw the student's name and average score
            g.drawString(studentNames[i] + " : " + average, 10, y);

            // If the student's name is "Hanni", draw her image
            if (studentNames[i].equals("Hanni")) {
                g.drawImage(hanniImage.getImage(), 200, y - 10, this);  // Draw image near the text
                y += hanniImage.getIconHeight();  // Increase y to prevent overlap with image height
            }

            y += 20;  // Increase y for the next student
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
