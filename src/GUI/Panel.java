package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Steven
 */
public class Panel extends JPanel {

    public Panel() {
        this.setPreferredSize(new Dimension(290, 300));
        this.setBackground(Color.DARK_GRAY);

    }//constructor

    private void draw(Graphics g) {
        // dibujar los ejes del plano cartesiano

        g.setColor(Color.white);
        g.fillOval(200, 20, 90, 90);
        g.setColor(Color.darkGray);
        g.fillOval(170, 20, 100, 100);
        for (int i = 0; i < 300; i++) {
            int x = (int) (Math.random() * 300);
            int y = (int) (Math.random() * 300);
            g.setColor(Color.white);
            g.fillOval(x, y, 3, 3);
        }

        g.setColor(new Color(17, 56, 4));
        g.fillOval(80, 80, 180, 200);
        g.setColor(new Color(3, 37, 13));
        g.fillOval(0, 110, 150, 170);
        g.setColor(new Color(3, 37, 13));
        g.fillOval(140, 110, 180, 170);
        g.setColor(new Color(78, 115, 23));
        g.fillRect(0, 200, 300, 120);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(40, 150, 50, 50);
        g.setColor(Color.BLACK);
        g.fillRect(45, 157, 15, 15);
        g.setColor(Color.BLACK);
        g.fillRect(70, 157, 15, 15);
        g.setColor(Color.BLACK);
        g.fillRect(55, 180, 18, 20);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // se llama al meto draw
        draw(g);

    }
}
