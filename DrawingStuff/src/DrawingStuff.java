import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class DrawingStuff {
    JFrame frame = new JFrame("Drawing Stuff");
    JComponent component = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            for (int y = 0; y < 256; y++) {
                for (int x = 0; x < 256; x++) {
                    Rectangle2D.Double rect = new Rectangle2D.Double(x, y, 800, 800);
                    Ellipse2D.Double cirlce = new Ellipse2D.Double(x, y, 256, 256);
                    g2.setColor(new Color(x % 256, y % 256, (x * y) % 256));
                    g2.draw(rect);
                    g2.draw(cirlce);
                }
            }
        }
    };

    public DrawingStuff() {
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(component);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new DrawingStuff();
    }
}
