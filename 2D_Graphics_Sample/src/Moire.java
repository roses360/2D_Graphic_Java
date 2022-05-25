import java.awt.Canvas;
import java.awt.Graphics;

public class Moire extends Canvas {

    public static void main(String[] args) {
        Canvas canvas = new Moire();
        new Window(Util.width, Util.height, "Moire", canvas);
    }

    public void paint(Graphics g) {
        radial(g);
        //concentric(g);
    }

    public void concentric(Graphics g){
        int i = 50;
        while (i < getWidth()) {
            g.drawOval((getWidth() - i)/2 , (getHeight() - i)/2 , i, i);
            i = i + 2;
            
        }
    }

    public void radial(Graphics g){
        int n = getWidth()/100;
        int i = 0;
        while( i <= getWidth()){
            g.drawLine(i, 0, getWidth()-i, getHeight());
            i += n;
        }
    
        i = 0;
        while( i <= getHeight()){
            g.drawLine(0, i, getWidth(), getHeight() -i);
            i += n;
        }
    }

}
