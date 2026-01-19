import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class ColorfulSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TV Remote Example");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.PINK); // frame background

        JLabel label = new JLabel("Channel: 1");
        label.setBounds(110, 50, 150, 30);
        label.setForeground(Color.BLUE); // label text color
        label.setFont(new Font("Arial", Font.BOLD, 18));

        JButton button = new JButton("Next Channel");
        button.setBounds(90, 110, 150, 40);
        button.setBackground(Color.MAGENTA); // button color
        button.setForeground(Color.WHITE);   // button text color
        button.setFont(new Font("Verdana", Font.BOLD, 14));

        button.addActionListener(new ActionListener() {
            int channel = 1;
            public void actionPerformed(ActionEvent e) {
                channel++;
                label.setText("Channel: " + channel);
            }
        });

        frame.setLayout(null);
        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }
}
