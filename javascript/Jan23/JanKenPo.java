package Jan23;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;



public class JanKenPo extends JPanel {
    String input; //field
    int userInput;


    public JanKenPo(){
        //String input2; //variable
        input = JOptionPane.showInputDialog("Welcome, please select from the following: rock, paper, or scissors");
        System.out.println("User Input: " + input);

        if (input.equalsIgnoreCase("rock")){
            userInput = 1;
        }

        if (input.equalsIgnoreCase("paper")){
            userInput = 2;
        }

        if (input.equalsIgnoreCase("scissors")){
            userInput = 3;
        }

        // 1 = rock
        // 2 = paper 
        // 3 = scissors
        int ran = (int) (Math.random() * 3) + 1;
        System.out.println("Random Generated: " + ran);

        //userinput = 1 ... ran == 3; -> user wins
        if(userInput == 1 && ran == 1){
            System.out.println("Tie");
        }
        if(userInput == 1 && ran == 2){
            System.out.println("paper wins");
        }
        if(userInput == 1 && ran == 3){
            System.out.println("rock wins");
        }
        if(userInput == 2 && ran == 1){
            System.out.println("paper wins");
        }
        if(userInput == 2 && ran == 2){
            System.out.println("tie");
        }
        if(userInput == 2 && ran == 3){
            System.out.println("scissors wins");
        }

    }
    
    public static void main(String[] args) {
        
        var window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(700,400);
        window.setContentPane(new JanKenPo());
        window.setVisible(false);

    }
}
