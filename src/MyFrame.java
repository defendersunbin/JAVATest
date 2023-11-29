import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("300 x 300 스윙 프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

