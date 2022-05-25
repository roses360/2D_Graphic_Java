
import java.awt.Graphics;
import java.awt.Rectangle;

public class Util {
    
    public static final int width = 400;
    public static final int longWidth = 600;
    public static final int height = 400;
    public static final int diameter = 200;


    public static void boxOval(Graphics g, Rectangle bb) {
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }
}
