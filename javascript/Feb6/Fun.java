package Feb6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Fun {
    
    public static void main(String[] args) {

        try {
            File f = new File("C:\\Users\\User1\\Downloads\\projects-MatthewMordo\\javascript\\Feb6\\randomNumbers.txt");
            Scanner reader = new Scanner(f);
            int i = 0;
            
            // Read through the file and process numbers
            while (reader.hasNext()) {
                try {
                    int x = reader.nextInt();
                    i += x;  // Only add to 'i' if it's a valid integer
                } catch (InputMismatchException ex) {
                    // Handle non-integer values
                    System.out.println("That was not a number: " + reader.next());
                }
            }
            
            // Print out the sum of all valid integers
            System.out.println("Sum of numbers: " + i);
            reader.close(); // Close the scanner after use
            
        } catch (FileNotFoundException ex) {
            // File wasn't found, provide feedback
            System.out.println("You put the wrong path, shame on thee!!");
        } catch (NoSuchElementException ex) {
            // If there's an issue with the file structure (e.g., missing integers)
            System.out.println("Could not find the second integer!");
        }
    }
}




    /*  this is the <> diamonds operator
        int[] numbers = new int[3];
        //ArrayList<Integer> numbersAL = new ArrayList<Integer>();
        //var numbersAL = new ArrayList<Integer>();
        ArrayList<Integer> numbersAL = new ArrayList<>(); //unlimited integers
        
    
        numbers[0] = 1; //set a value at specified index
        numbers [1] = 5;
        numbers [2] = 3;
        // numbers[3] = 4; throw index out of bounds

        numbersAL.add(1);
        numbersAL.add(2);
        numbersAL.add(3);



        System.out.println("Position 1: " + numbers[0]); //read a value at specified index
        System.out.println("Position 2: " + numbers[1]);
        System.out.println("Position 3: " + numbers[2]);

        System.out.println("Position 1: " + numbersAL.get(0)); //read a value at specified index
        System.out.println("Position 2: " + numbersAL.get(1));
        System.out.println("Position 3: " + numbersAL.get(2));

        //update value at specified index
        //numbers[1] = numbers[1] * 5;
        numbers[1] *= 5;
        System.out.println("Position 2: " + numbers[1]);

        numbersAL.set(1, numbersAL.get(1) * 5);
        System.out.println("Position 2: " + numbersAL.get(1));

        int sum = 0;
        for (int num: numbersAL){
            sum += num;
        }

        System.out.println("sum of arraylist: " + sum); */
    

