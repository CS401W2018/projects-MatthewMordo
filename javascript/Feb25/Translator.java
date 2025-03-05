package Feb25;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Translator extends JPanel {
    private ArrayList<String> english;
    private ArrayList<String> french;

    public Translator() {
        english = new ArrayList<>();
        french = new ArrayList<>();
        loadEnglishWords();
        loadFrenchWords();
        mainLoop();
    }

    public void loadEnglishWords() {
        try (Scanner scanner = new Scanner(new File("C:\\Users\\Kit-Lee\\Documents\\BYU-Hawaii\\Fall Semester\\projects-MatthewMordo\\javascript\\Feb25\\english.txt"))) {
            while (scanner.hasNextLine()) {
                english.add(scanner.nextLine().trim());
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: english.txt file not found.", "File Not Found", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void loadFrenchWords() {
        try (Scanner scanner = new Scanner(new File("C:\\Users\\Kit-Lee\\Documents\\BYU-Hawaii\\Fall Semester\\projects-MatthewMordo\\javascript\\Feb25\\french.txt"))) {
            while (scanner.hasNextLine()) {
                french.add(scanner.nextLine().trim());
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: french.txt file not found.", "File Not Found", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String lookup(String word) {
        for (int i = 0; i < english.size(); i++) {
            if (english.get(i).equalsIgnoreCase(word)) {
                return french.get(i);
            }
        }
        return "No match found";
    }

    public void mainLoop() {
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Enter an English word to translate:", "English to French Translator", JOptionPane.QUESTION_MESSAGE);
            if (input == null) return; // User pressed cancel
            
            String translation = lookup(input);
            int choice = JOptionPane.showConfirmDialog(null, "The French word is: " + translation + "\nWant to play again?", "Result", JOptionPane.YES_NO_OPTION);
            
            if (choice == JOptionPane.NO_OPTION) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Translator::new);
    }

}
