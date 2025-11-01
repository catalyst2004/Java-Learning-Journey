import javax.swing.*;
import java.awt.*;

public class Form {
    public static void main(String[] args){
        JFrame frame = new JFrame("Login Page");
        frame.setSize(800,800);
        frame.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Username :");
        frame.add(l1);
        JTextField text = new JTextField(20);
        frame.add(text);
        JLabel l2 = new JLabel("Password :");
        frame.add(l2);
        JTextField t2 = new JTextField(8);
        frame.add(t2);
        frame.setVisible(true);
    }
}
