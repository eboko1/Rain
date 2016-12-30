import javax.swing.*;
import java.awt.*;

/**
 * Created by Vika on 30.12.2016.
 */
public class Drop extends JPanel{
    public final int WIDTH=640;
    int x=WIDTH/2;
    int y=0;
    int yspeed=1;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(new Color(230,238,250));

        g.setColor(new Color(138,43,226));
        g.drawLine(x,y,x,y+10);


    }



}


