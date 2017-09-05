import java.awt.*;
import java.applet.*;

public class Naam2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Kevin", 50, 60 );

        g.setColor(Color.red);
        g.drawString("Assink",60, 70);
    }
}