import java.applet.Applet;
import java.awt.*;

public class Eclipse extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.drawOval(20, 20, 250, 200);
        g.setColor(Color.yellow);
        g.fillArc(20, 20, 250, 200, 75, 90);
    }
}