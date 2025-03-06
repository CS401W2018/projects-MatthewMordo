package Mar6part2;

import javax.swing.JFrame;
import mar6.override;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


class Tree{
    private int x, y, trunkWidth, trunkHeight, leafSize;

    public Tree(int x, int y, int trunkWidth, int trunkHeight, int leafSize){
    this.x = x;
    this.y = y;
    this.trunkHeight = trunkHeight;
    this.trunkWidth = trunkWidth;
    this.leafSize = leafSize;

    }



public void draw (Graphics g){
    g.setColor(new Color(139,69,19));
    g.fillRect(x, y, trunkWidth, trunkHeight);

    g.setColor(Color.green);
    g.fillOval(x - leafSize / 5, y - leafSize, leafSize, leafSize);
    g.fillOval(x + trunkWidth - leafSize / 2, y - leafSize , leafSize, leafSize);
    g.fillOval(x + trunkWidth / 2 - leafSize / 2, y - leafSize * 3 / 2, leafSize, leafSize);

    }
}

class TreePanel extends JPanel{
    private List<Tree> trees;

    public TreePanel(){
        trees = new ArrayList<>();
        trees.add(new Tree(100, 300, 20, 60, 50));
        trees.add(new Tree(250,250,30,80,70));
        trees.add(new Tree(400 ,200,40,100,90));

    }


@override
protected void paintComponent(Graphics g){
    super.paintComponent(g);
    for(Tree tree : trees){
        tree.draw(g);
        }
    }
}


public class DrawTree {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tree Drawing");
        TreePanel panel = new TreePanel();

        frame.add(panel);
        frame.setSize(600,400);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
