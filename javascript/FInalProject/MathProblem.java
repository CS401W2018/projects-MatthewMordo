package FInalProject;

import java.awt.Graphics;
import java.util.Random;
import java.awt.Font;

public class MathProblem {
    private int num1;
    private int num2;
    private int answer;
    private char operator; // Store the operator (+, -, ×, ÷)

    // Constructor generates a random math problem
    public MathProblem() {
        Random rand = new Random();
        num1 = rand.nextInt(13); // Random number between 0 and 12
        num2 = rand.nextInt(13); // Random number between 0 and 12

        // Randomly choose an operator (0 = +, 1 = -, 2 = *, 3 = /)
        int op = rand.nextInt(4);
        switch (op) {
            case 0: // Addition
                operator = '+';
                answer = num1 + num2;
                break;
            case 1: // Subtraction (Ensure num1 >= num2 to avoid negative results)
                operator = '-';
                if (num1 < num2) {
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                answer = num1 - num2;
                break;
            case 2: // Multiplication
                operator = '\u00D7'; // Unicode for ×
                answer = num1 * num2;
                break;
            case 3: // Division (Ensure num2 is not zero and result is an integer)
                operator = '\u00F7'; // Unicode for ÷
                while (num2 == 0 || num1 % num2 != 0) {
                    num1 = rand.nextInt(13);
                    num2 = rand.nextInt(12) + 1; // Ensure num2 is at least 1
                }
                answer = num1 / num2;
                break;
        }

        // Print the full equation to the console for debugging
        System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
    }

    // Method to draw the math problem on the screen
    public void draw(Graphics g, int width, int height) {

        Font customFont = new Font("Times New Roman", Font.PLAIN , 25); // Change font face & size
        g.setFont(customFont);
        g.drawString(num1 + " " + operator + " " + num2 + " =", width / 2 - 30, height / 4);
        
    }
}