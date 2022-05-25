import java.awt.Canvas;
import javax.swing.JFrame;

public class Window extends Canvas {
    public Window(int width, int height, String title, Canvas canvas){
        JFrame frame = new JFrame(title);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        canvas.setSize(width, height);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
