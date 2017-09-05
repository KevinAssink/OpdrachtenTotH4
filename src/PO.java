import java.applet.Applet;
import java.awt.*;

public class PO extends Applet {

    public void paint(Graphics g) {
        g.drawLine(10, 10, 160, 10);
        g.drawString("Lijn", 75, 25);

        g.drawRect(10, 50, 150, 100);
        g.drawString("Rechthoek", 60, 170);

        g.drawRoundRect(10, 180, 150, 100, 30, 30);
        g.drawString("Afgeronde rechthoek", 30, 300);

        g.setColor(Color.magenta);
        g.fillRect(200, 50, 150, 100);
        g.setColor(Color.black);
        g.drawOval(200, 50, 149, 99);
        g.drawString("Gevulde rechthoek met ovaal", 195, 170);

        g.setColor(Color.black);
        g.drawOval(360, 50, 150, 100);
        g.setColor(Color.MAGENTA);
        g.fillArc(361, 51, 150, 100, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 360, 170);

        g.setColor(Color.magenta);
        g.fillOval(200, 180, 150, 100);
        g.setColor(Color.black);
        g.drawString("Ovaal", 260, 300);

        g.setColor(Color.black);
        g.drawOval(380, 180, 100, 100);
        g.drawString("Cirkel", 420, 300);

    }
}
