import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Homework2 extends JFrame {
    JButton redButton, blueButton, yellowButton;

    public Homework2() {
        setTitle("색깔");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        redButton = new JButton("빨강");
        blueButton = new JButton("파랑");
        yellowButton = new JButton("노랑");

        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color currentColor = getContentPane().getBackground();
                if (!currentColor.equals(Color.RED)) {
                    getContentPane().setBackground(Color.RED);
                    redButton.setText("red");
                    blueButton.setText("파랑");
                    yellowButton.setText("노랑");
                }
            }
        });
        c.add(redButton);

        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color currentColor = getContentPane().getBackground();
                if (!currentColor.equals(Color.BLUE)) {
                    getContentPane().setBackground(Color.BLUE);
                    redButton.setText("빨강");
                    blueButton.setText("blue");
                    yellowButton.setText("노랑");
                }
            }
        });
        c.add(blueButton);

        yellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color currentColor = getContentPane().getBackground();
                if (!currentColor.equals(Color.YELLOW)) {
                    getContentPane().setBackground(Color.YELLOW);
                    redButton.setText("빨강");
                    blueButton.setText("파랑");
                    yellowButton.setText("yellow");
                }
            }
        });
        c.add(yellowButton);

        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Homework2();
    }
}
