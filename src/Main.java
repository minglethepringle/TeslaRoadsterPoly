import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static int width = 1200, height = 675, buffer = 22;

    public static void main(String[] args) {

        JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(width, height+buffer));

        JPanel panel = new GraphicsPanel(width, height+buffer);
        panel.setFocusable(true);
        panel.grabFocus();
        frame.setTitle("Mingle Li | Tesla Roadster");

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }

    public static int random(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
