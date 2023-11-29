import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("ContentPane과 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JCheckBox("신선빈"));
        contentPane.add(new JRadioButton("202015046"));

        setSize(300, 150);
        setVisible(true);
    }
    public static void main(String[] args) {
        ContentPaneEx cp = new ContentPaneEx();
    }
}