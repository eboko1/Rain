import java.awt.*;

/**
 * Created by Vika on 30.12.2016.
 */
public class Drop {
    int x = 640 / 2;
    int y = 0;
    int yspeed = 1;

    public void fall() {
        y = y + yspeed;
    }

    public void show(Graphics g) {
        g.setColor(new Color(138, 43, 226));
       g.drawLine(y, x, x, y + 10);

    }
}


