import java.applet.Applet;
import java.awt.*;

public class DobbelSteen extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRoundRect(100, 100, 100, 100, 10, 10);

        g.setColor(Color.black);
        g.fillOval(115, 110, 25, 25);
        g.fillOval(115, 165, 25, 25);
        g.fillOval(160, 110, 25, 25);
        g.fillOval(160, 165, 25, 25);
    }
}
