package FInalProject;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public class Garden {
    private ArrayList<Flower> flowers;
    private ArrayList<Weed> weeds;

    // Constructor
    public Garden() {
        flowers = new ArrayList<>();
        weeds = new ArrayList<>();
        Random rand = new Random();

        // Create 16 plants (at least 1 flower and 1 weed)
        for (int i = 0; i < 12; i++) {
            int x = (i % 6) * 150 + 50; // Staggered in columns
            int y = (i / 6) * 100 + 250; // Staggered in rows, starting below the sky

            // Alternate between flowers and weeds, ensuring at least one of each
            if (i == 0) {
                flowers.add(new Flower(new Point(x, y)));
            } else if (i == 1) {
                weeds.add(new Weed(new Point(x, y)));
            } else if (rand.nextBoolean()) {
                flowers.add(new Flower(new Point(x, y)));
            } else {
                weeds.add(new Weed(new Point(x, y)));
            }
        }
    }

    // Draw method
    public void draw(Graphics g) {
        // Draw all flowers
        for (Flower flower : flowers) {
            flower.draw(g);
        }
        // Draw all weeds
        for (Weed weed : weeds) {
            weed.draw(g);
        }
    }
}