import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {


    public void paint(Graphics g) {
        g.fillRoundRect(90, 55, 60, 100, 20, 30);
        g.fillRect(115, 155, 10, 100);

        g.setColor(Color.red);
        g.fillOval(106, 60, 30, 30);

        g.setColor(Color.orange);
        g.fillOval(106, 90, 30, 30);

        g.setColor(Color.green);
        g.fillOval(106, 120, 30, 30);
    }

}
