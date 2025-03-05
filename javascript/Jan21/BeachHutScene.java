package Jan21;

    import java.awt.Color;
    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import java.awt.Graphics;

    public class BeachHutScene extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int changeY = 0;
            int changeX = -90;

            // Sky
            g.setColor(Color.CYAN);
            g.fillRect(0, 0, getWidth(), getHeight() / 2);
            
            // Clouds
            g.setColor(Color.WHITE);
            g.fillOval(50, 50, 100, 50);
            g.fillOval(90, 30, 120, 60);
            g.fillOval(130, 50, 100, 50);

            g.fillOval(300, 70, 120, 60);
            g.fillOval(340, 50, 100, 50);
            g.fillOval(380, 70, 120, 60);

            g.fillOval(450, 30, 100, 50);
            g.fillOval(480, 50, 120, 60);
            g.fillOval(520, 30, 100, 50);
    
            // Foliage
            g.setColor(Color.GREEN);
            g.fillArc(-100, 100 + changeY, 300, 200, 0, 180);
            g.fillArc(50, 100 + changeY, 300, 200, 0, 180);
            g.fillArc(200, 100 + changeY, 300, 200, 0, 180);
            g.fillArc(350, 100 + changeY, 300, 200, 0, 180);
    
            // Beach
            g.setColor(Color.YELLOW);
            g.fillRect(0, getHeight() / 2 + changeY, getWidth(), getHeight() / 4);
    
            // Ocean with waves
            g.setColor(Color.BLUE);
            g.fillRect(0, getHeight() * 3 / 4 + changeY, getWidth(), getHeight() / 4);
            g.setColor(Color.CYAN);
            for (int i = 0; i < getWidth(); i += 40) {
                g.fillOval(i, getHeight() * 3 / 4 + changeY - 10, 40, 20);
            }
    
            // Hut body (move it up by 80 pixels to make the hut float)
            g.setColor(Color.MAGENTA);
            g.fillRect(220 + changeX, 100 + changeY - 30, 150, 150); // Move hut 50 pixels up

            // Hut roofs (move them up by 80 pixels)
            g.setColor(Color.ORANGE);
            g.fillRect(190 + changeX, 40 + changeY - 30, 220, 20); // Top roof
            g.fillRect(210 + changeX, 80 + changeY - 30, 180, 20); // Main roof
            g.fillRect(200 + changeX, 60 + changeY - 30, 200, 20); // Upper roof

            // Door (80 pixels to with the hut)
            g.setColor(Color.BLACK);
            g.fillRect(270 + changeX, 170 + changeY - 30, 40, 80);

            // Window (80 pixels to with the hut)
            g.fillRect(300 + changeX, 120 + changeY - 30, 20, 20);

            // Sign beside the hut
            g.setColor(Color.cyan);
            g.fillRect(95 + changeX, 200 + changeY, 110, 40); // Sign background
            g.setColor(Color.BLACK);
            g.drawRect(95 + changeX, 200 + changeY, 110, 40); // Sign border

            // Text on the sign
            g.drawString("Michael-Lee's Hut", 100 + changeX, 225 + changeY);

            // Airplane
            g.setColor(Color.GRAY);
            g.fillRect(400, 50, 60, 20); // Airplane body
            g.fillRect(420, 40, 20, 10); // Airplane tail
            g.setColor(Color.DARK_GRAY);
            g.fillRect(390, 55, 10, 5); // Wing

            // Banner
            g.setColor(Color.cyan);
            g.fillRect(463, 50, 120, 20); // Banner background
            g.setColor(Color.BLACK);
            g.drawRect(465, 50, 120, 20); // Banner border
            g.drawString("GO SEASIDERS!!", 470, 65); // Banner text
        }

        public static void main(String[] args) {
            var window = new JFrame();
            window.setSize(600, 400);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setContentPane(new BeachHutScene());
            window.setVisible(true);
        }
    }