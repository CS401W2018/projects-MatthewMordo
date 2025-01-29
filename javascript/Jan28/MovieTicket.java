package Jan28;

import javax.swing.*;

public class MovieTicket {
    public static void main(String[] args) {
        // Ask if the user has a student or military ID
        int discountEligibility = JOptionPane.showConfirmDialog(
            null,
            "Do you have a student or military ID?",
            "Discount Eligibility",
            JOptionPane.YES_NO_OPTION
        );

        boolean hasDiscount = (discountEligibility == JOptionPane.YES_OPTION);

        // Ask for user age
        String input = JOptionPane.showInputDialog(null, "Enter your age:");

        try {
            // Convert input to an integer
            int age = Integer.parseInt(input);

            // Initialize variables
            String message = "";
            String imagePath = "";

            // Determine the message and image based on age
            if (age >= 0 && age < 3) {
                message = "You get in free!";
                imagePath = "C:\\Users\\Kit-Lee\\Documents\\BYU-Hawaii\\Fall Semester\\projects-MatthewMordo\\javascript\\Jan28\\wish.jpg";  
            } else if (age >= 3 && age <= 11) {
                message = "You owe $7.00!";
                imagePath = "C:\\Users\\Kit-Lee\\Documents\\BYU-Hawaii\\Fall Semester\\projects-MatthewMordo\\javascript\\Jan28\\wonka.jpg";  
            } else if (age > 11 && age < 60) {
                if (hasDiscount) {
                    message = "You owe $8.00! (Student/Military Discount Applied)";
                } else {
                    message = "You owe $10.00!";
                }
                imagePath = "C:\\Users\\Kit-Lee\\Documents\\BYU-Hawaii\\Fall Semester\\projects-MatthewMordo\\javascript\\Jan28\\aquaman.jpg";  
            } else if (age >= 60 && age < 120) {
                message = "That will be $7.00, please.";
                imagePath = "C:\\Users\\Kit-Lee\\Documents\\BYU-Hawaii\\Fall Semester\\projects-MatthewMordo\\javascript\\Jan28\\Daisy.jpeg";  
            } else {
                message = "Are you sure you typed that correctly?";
            }

            // Display the message with or without an image
            if (!imagePath.isEmpty()) {
                ImageIcon icon = new ImageIcon(imagePath);
                JOptionPane.showMessageDialog(null, message, "Ticket Price", JOptionPane.INFORMATION_MESSAGE, icon);
            } else {
                JOptionPane.showMessageDialog(null, message, "Ticket Price", JOptionPane.WARNING_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
