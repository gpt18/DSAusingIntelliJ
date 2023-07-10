import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackgroundColorChanger extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;
    private Timer timer;

    public BackgroundColorChanger() {
        setTitle("Background Color Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        button = new JButton("Change Color");
        button.addActionListener(this);

        label = new JLabel("Welcome to Java Swing");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        add(button);
        add(label);

        timer = new Timer(500, new ActionListener() {
            private boolean visible = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setVisible(visible);
                visible = !visible;
            }
        });

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // Generate a random RGB color
            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);

            Color randomColor = new Color(red, green, blue);
            getContentPane().setBackground(randomColor);

            // Start the timer to make the label flash
            timer.start();

            // Stop the timer after 2 seconds (2000 milliseconds)
            Timer stopTimer = new Timer(2000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    timer.stop();
                    label.setVisible(true);
                }
            });
            stopTimer.setRepeats(false);
            stopTimer.start();

            // Display popup message
            JOptionPane.showMessageDialog(this, "Welcome to Java Swing", "Popup Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BackgroundColorChanger();
            }
        });
    }
}
