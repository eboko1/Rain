package fvi.main;

import javax.swing.*;

/**
 * Created by Vika on 31.12.2016.
 */
public class RainMain extends JFrame {
    public final int WIDTH=640;
    public final int HEIGHT=360;

    public RainMain (){
        setSize(WIDTH,HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new RainPanel());
        setVisible(true);
    }
    public static void main (String[] args) {
        new RainMain();
    }


}