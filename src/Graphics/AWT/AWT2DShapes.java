package Graphics.AWT;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AWT2DShapes extends  Frame{
    public AWT2DShapes()
    {
        setVisible(true);
        setSize(300, 300);

        Label string = new Label("Check for the font style");
        add(string);

        ImageIcon icon = new ImageIcon("logo.png");
        setIconImage(icon.getImage());

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g)
    {
        g.drawRect(50, 60, 50, 20);
        g.drawRoundRect(50, 90, 50, 20, 10, 10);
        g.fillRect(50, 120, 50, 20);
        g.fillRoundRect(50, 150, 50, 20, 10, 10);

        //using color
        g.setColor(Color.blue);

        //creating shape
        g.fillArc(170,200,100,100,0,180);

        //font
        Font font = new Font("Arial", Font.BOLD, 20);
        setFont(font);




    }

    public static void main(String[] args)
    {
        new AWT2DShapes();


    }

}



