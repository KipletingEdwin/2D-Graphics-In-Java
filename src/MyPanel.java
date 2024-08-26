import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    MyPanel(){

    }

    public  void  paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawLine(0,0,500,500);
    }
}
