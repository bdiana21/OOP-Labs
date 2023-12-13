import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        JLabel l = new JLabel ("username");
        JTextField tf = new JTextField();
        tf.setColumns(15);
        panel1.add(l);
        panel1.add(tf);
        panel1.setLayout(new FlowLayout());


        JLabel l2 = new JLabel ("password");
        JTextField tf2 = new JTextField();
        tf2.setColumns(15);
        panel2.add(l2);
        panel2.add(tf2);

        JPanel p = new JPanel();

        JCheckBox box=new JCheckBox("Terms & Conditions");
        JButton log=new JButton("Log in");

        log.addActionListener(new LoginListener());

        JLabel logLabel =new JLabel("Not logged in");
        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logLabel.setText("Succesfully logged in!");
            }
        });
        p.add(panel1);
        p.add(panel2);
        p.add(box);
        p.add(log);
        p.add(logLabel);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        frame.setContentPane(p);
        frame.setVisible(true);
    }
}