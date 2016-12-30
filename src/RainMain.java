import javax.swing.*;
import java.awt.*;

/**
 * Created by Vika on 30.12.2016.
 */
public class RainMain extends JFrame {
    JPanel p = new JPanel();
    Drop d;
    public static void main (String arg[]){
        new RainMain();
    }

    public RainMain(){
        super ("Blue RAIN ");
        setSize(640,360);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(p);
        setVisible(true);
        setup();
        draw();
    }


    public  void setup(){
        d=new Drop();
    }

    public void draw(){
        setBackground(new Color(230,230,250));
        d.fall();
        d.show();
    }












/*    public static final int WIDTH=640;
    public static final int HEIGHT=360;

    Drop d = new Drop();
    public static void main(String arg[]){
        JFrame f = new JFrame("Blue Rain ");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(WIDTH,HEIGHT);
        f.setBackground(Color.CYAN);
        //f.add();
        f.setVisible(true);
        f.add(new Drop());
    }*/

}
