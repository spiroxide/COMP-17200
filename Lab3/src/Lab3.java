import javax.swing.*;
import java.awt.*;

/**
 * Erich Ostendarp
 * 2/4/18
 * draws a horse in a field
 */
public class Lab3 {
    JFrame frame = new JFrame("Lab3");
    JComponent component;

    public Lab3(int width, int height) {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setResizable(false);
        component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                ((Graphics2D) g).setRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));
                // background
                g.setColor(Color.CYAN);
                g.fillRect(0, 0, width, height / 3);
                g.setColor(Color.YELLOW);
                g.fillOval(-50, -50, 200, 200);
                for (int i = 0; i < 20; i++) {
                    g.setColor(Color.WHITE);
                    int x = (int) (Math.random() * (width - 25));
                    int y = (int) (Math.random() * (height - 150) / 3);
                    g.fillOval(x, y, 100, 50);
                    g.setColor(new Color(225, 225, 225));
                    g.drawOval(x, y, 100, 50);
                }
                g.setColor(Color.GREEN);
                g.fillRect(0, height / 3, width, height);
                // legs
                g.setColor(new Color(150, 75, 20));
                for (int i = 0; i < 4; i++) {
                    g.fillRect((width - 25) / 2 - 35 + i * 25, (height - 50) / 2 + 30, 15, 50 - 2 * i);
                }
                // body
                g.setColor(new Color(139, 69, 19));
                g.fillRoundRect((width - 100) / 2, (height - 50) / 2, 100, 50, 50, 50);
                // head
                g.setColor(new Color(125, 50, 10));
                g.fillRoundRect((width - 50) / 2 - 50, (height - 30) / 2 - 27, 50, 30, 25, 25);
                // eye
                g.setColor(Color.WHITE);
                g.fillOval((width - 50) / 2 - 20, (height - 30) / 2 - 25, 10, 10);
                g.setColor(Color.BLACK);
                g.fillOval((width - 50) / 2 - 19, (height - 30) / 2 - 23, 5, 5);
            }
        };
        frame.add(component);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Lab3(1920, 1080);
    }
}
