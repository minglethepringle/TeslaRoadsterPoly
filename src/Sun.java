import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Sun {

    public int x, y, rad;
    private Color sun = new Color(255, 232, 141, 250);
    private int spread = 15;

    public Sun(int x, int y, int rad) {
        this.x = x;
        this.y = y;
        this.rad = rad;

    }

    public void draw(Graphics2D g2, int s) {

        for (int i = 0; i < s; i++) {
            if(i == 0) {
                g2.setColor(sun);
            } else {
                g2.setColor(new Color(255, 232, 141, 80 - ((i-1) * 20)));
            }

            g2.fillOval((int) (x - (i * 0.5 * spread)), (int) (y - (i * 0.5 * spread)), (2 * rad) + i * spread, (2 * rad) + i * spread);
        }
    }

}
