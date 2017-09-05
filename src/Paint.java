import java.awt.*;
import java.applet.*;

public class Paint extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(40, 140, 100, 100);
        g.drawLine(160, 140, 100, 100);
        g.drawRect(40, 140, 120, 110);
        g.drawRect(60, 160, 30, 30);
        g.drawRect(110, 210, 25, 40);
        g.drawLine(1, 250, 1000, 250);
        g.setColor(Color.black);
        g.fillRect(200, 20, 10, 230);
        g.setColor(Color.red);
        g.fillRect(210, 20, 80, 20);
        g.setColor(Color.blue);
        g.fillRect(210, 60, 80, 20);

        ;


    }
}