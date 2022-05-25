import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class FlagOfJapan extends Canvas{
    public static void main(String[] args) {
        
        Canvas canvas = new FlagOfJapan();
        canvas.setBackground(Color.white);
        new Window(Util.longWidth, Util.height, "Flag of Japan", canvas);

    }

    @Override
    public void paint(Graphics g){

        g.setColor(Color.red);
        Rectangle r = new Rectangle((Util.longWidth - Util.diameter)/2, (Util.height - Util.diameter)/2, Util.diameter, Util.diameter);
        Util.boxOval(g, r);
        
    }
}
