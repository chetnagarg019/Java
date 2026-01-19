import javax.swing.*;
import java.awt.event.*;

public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first page");
        JButton button = new JButton("Click Me");

        button.setBounds(50, 50, 120, 30);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hello World!");
            }
        });

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


