package Graphics.AWT;
import javax.swing.*;
import  java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class EventHandling extends JFrame {

    private JButton button;

    public EventHandling() {
        setSize(400,400);
        setBackground(Color.GREEN);
        setVisible(true);

        button = new JButton("Click me");
        button.addMouseListener(new MouseEventHandler());

        add(button);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }
    public static void main(String[] args) {
        new EventHandling();
    }


}

class MouseEventHandler implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(null, "Button clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
