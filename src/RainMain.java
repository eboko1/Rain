import javax.swing.*;

/**
 * Created by Vika on 30.12.2016.
 */
public class RainMain   {
  public static void main (String arg[]) {




    JFrame f = new JFrame("Blue Rain");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Drop d = new Drop();
    f.setSize(640,360);
    f.setVisible(true);
    f.add(d);
  }
}
