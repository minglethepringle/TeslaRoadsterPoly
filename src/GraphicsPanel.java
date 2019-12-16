import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.*;

public class GraphicsPanel extends JPanel {

    public GraphicsPanel(int width, int height){
        setSize(width,height);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;

        Scenery scenery = new Scenery();
        scenery.draw(g2);

        for (int i = 0; i < 3; i++) {
            Bird bird = new Bird(Main.random(50, Main.width - 50), Main.random(50, 100), Main.random(-20, 20));
            bird.draw(g2);
        }

        Car car = new Car();
        car.draw(g2);

        Sun sun = new Sun(96, 75, 50);
        sun.draw(g2, 4);
    }

}
