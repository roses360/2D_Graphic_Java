import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;

public class MickeyMouse extends Canvas{
    
    final int levels = 6;
    int n = 1;
    

    public static void main(String[] args) {
        Canvas canvas = new MickeyMouse();
        new Window(400, 400, "Mickey Mouse Fractal", canvas);
        
    }

    @Override
    public void paint(Graphics g){

        //g.fillOval(100, 100, 200, 200);
        Rectangle r = new Rectangle((Util.width - Util.diameter)/2, (Util.height - Util.diameter)/2, Util.diameter, Util.diameter);
        mickey(g, r);
        
    }

    

    public void mickey(Graphics g, Rectangle bb) {
        
        if( n < levels){
            Util.boxOval(g, bb);

            int dx = bb.width / 2;
            int dy = bb.height / 2;
            Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);
        
            half.translate(-dx / 2, -dy / 2);
            Util.boxOval(g, half);
            if(n < levels){
                n++;
                mickey(g, half);
            }
            
            half.translate(dx * 2, 0);
            Util.boxOval(g, half);
            if(n < levels){
                mickey(g, half);
            }
            n--;
        }
        
    }

}
