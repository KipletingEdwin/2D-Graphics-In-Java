import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    MyPanel(){
        this.setPreferredSize(new Dimension(500,500));
    }

    public  void  paint(Graphics g){

        Graphics2D g2d = (Graphics2D) g;


        g2d.setPaint(Color.blue);
        g2d.setStroke(new BasicStroke(5));
        //g2d.drawLine(0,0,500,500);


        //g2d.drawRect(0,0,100,200);
        //g2d.setPaint(Color.pink);
        //g2d.fillRect(0,0,100,200);

        //g2d.setPaint(Color.orange);
        //g2d.drawOval(0,0,100,200);
        //g2d.fillOval(0,0,100,200);
        g2d.setPaint(Color.red);
        //g2d.drawArc(0,0,100,100,0,180);
        g2d.fillArc(0,0,100,100,0,180);

    }
}
