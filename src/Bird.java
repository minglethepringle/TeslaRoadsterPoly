import java.awt.*;
import java.awt.geom.AffineTransform;

public class Bird {

    private Color bird = new Color(87, 87, 87, 100);
    private int x, y, tilt;

    public Bird(int x, int y, int tilt) {
        this.x = x;
        this.y = y;
        this.tilt = tilt;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(bird);
        g2.setStroke(new BasicStroke(3f));

        AffineTransform old = g2.getTransform();
        g2.rotate(Math.toRadians(tilt), x, y);

        int[] xs = {x, x + 8, x + 16, x + 21, x + 23, x + 25, x + 31, x + 38, x + 45};
        int[] ys = {y, y - 4, y - 4, y + 1, y + 3, y + 1, y - 4, y - 4, y + 1};
        g2.drawPolyline(xs, ys, xs.length);

        g2.setTransform(old);
    }

}
