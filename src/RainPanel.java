import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Vika on 31.12.2016.
 */
public class RainPanel extends JPanel implements ActionListener {
RainLine rainLn = new RainLine();
    public RainPanel(){
    Timer timer = new Timer(50,this);
        timer.start();
    }
    public void update(){
        rainLn.update();

    }
    public void paint(Graphics g){

        g.setColor(new Color(230,230,250));
        g.fillRect(0,0,640,360);

        rainLn.draw(g);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        update();
        repaint();
    }
}
