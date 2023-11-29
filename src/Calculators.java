import javax.swing.*;
import java.awt.*;

public class Calculators extends JFrame {
    public Calculators() {
        setTitle("게산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new BorderLayout());

        JTextField result = new JTextField("0");
        result.setHorizontalAlignment(JTextField.RIGHT);
        result.setEditable(false);
        c.add(result, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4,3,3));

        String[] buttons = {
                "1", "2", "3", "/",
                "4", "5", "6", "*",
                "7", "8", "9", "-",
                ".", "0", "=", "+"
        };

        for(String s : buttons) {
            panel.add(new JButton(s));
        }

        c.add(panel, BorderLayout.CENTER);

        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Calculators();
    }
}