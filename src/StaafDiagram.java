import java.awt.*;
import java.applet.*;




public class StaafDiagram extends Applet {

    public void init (){

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(10, 200, 300, 200);
        g.drawLine(10, 1,10,200);
        g.setColor(Color.blue);
        g.fillRect(50, 160, 50, 40);
        g.setColor(Color.red);
        g.fillRect(120, 100, 50, 100 );
        g.setColor(Color.GREEN);
        g.fillRect(190, 120, 50, 80 );
        g.setColor(Color.black);
        g.drawString("Blue = Valerie, 40 KG", 10, 250 );
        g.drawString("Red = Jeroen, 100 KG", 10, 260);
        g.drawString("Green = Hans, 80 KG", 10, 270);
        g.setColor(Color.gray);
        g.drawLine(10, 20, 300, 20);
        g.drawLine(10, 40, 300, 40);
        g.drawLine(10, 60, 300, 60);
        g.drawLine(10, 80, 300, 80);
        g.drawLine(10, 100,300, 100);
        g.drawLine(10, 120,300, 120);
        g.drawLine(10, 140,300, 140);
        g.drawLine(10, 160,300, 160);
        g.drawLine(10, 180,300, 180);
        g.setColor(Color.black);
        g.drawString("0",  301, 205);
        g.drawString("20", 301, 185);
        g.drawString("40", 301, 165);
        g.drawString("60", 301, 145);
        g.drawString("80", 301, 125);
        g.drawString("100",301, 105);
        g.drawString("120",301, 85);
        g.drawString("140",301, 65);
        g.drawString("160",301, 45);
        g.drawString("180",301, 25);

    }
}
