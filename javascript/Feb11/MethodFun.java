package Feb11;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

    

class MethodFun extends JPanel{

    public int getRandomNumber(){
        return (int)(Math.random() * 600);

    }

    public void drawRect(int width, int height, Color c, Graphics g){

        g.setColor(c);
        g.fillRect(getRandomNumber(),getRandomNumber(),width,height);

    }

    @Override
    public void paintComponent(Graphics g){

        drawRect(50, 60, Color.BLUE, g);
        drawRect(140, 50, Color.RED, g);
        drawRect(500, 60, Color.BLACK, g);

        //int randomX = (int)(Math.random() * 600);
        //int randomY = (int)(Math.random() * 600);

        //System.out.println("RandomX: " + randomX + ", RandomY: " + randomY);

        /*g.setColor(Color.BLUE);
        g.fillRect(getRandomNumber(),getRandomNumber(),50,50);

        g.setColor(Color.RED);
        g.fillRect(getRandomNumber(),getRandomNumber(),140,90);

        g.setColor(Color.BLACK);
        g.fillRect(getRandomNumber(),getRandomNumber(),500,60);
        /* */
        System.out.println("We are done!");

    }

    //method signature
    //modifier (static) return type (object), name, (formal parameters)
    // void - used to return nothing 
    //modifiers - public / private / protected

    // public :it is accessible across all classes -> infront of methods
    // private : it's only accessible to only the current class -> fields
    // protected : its accessible to the current class and it's children / inherited class. -> when sharing fields accross the inherited classes

    // return types: can be anything. Primitive type, object, void (nothing).
    // name: Start with a verb (describe what your method is doing ex. CalculateX, GraphX) followed by adjectives, nouns.
    // (): put your formal parameters, you can put 0 -> infinite. (Data Type Name). Example: (String[] args)

    public static void main(String[] args) {

        JFrame windows = new JFrame();
        windows.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        windows.setSize(600,600);
        windows.setContentPane(new MethodFun());
        windows.setVisible(true);
        


    }
}
