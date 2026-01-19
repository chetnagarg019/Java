import javax.swing.*;
import java.awt.event.*;

public class Gui1 {

    public static void main(String[] args) {
            JFrame frame = new JFrame("It is my first frame");
            frame.setSize(300,400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("Hello kids");
            label.setBounds(100,50,200,30);

            JButton button = new JButton("Click me!");
            button.setBounds(80,30,120,20);

            button.addActionListener(new ActionListener() {
                int channel = 1;
                public void actionPerformed(ActionEvent e){
                    channel++;
                    label.setText("channel:" + channel);
                }
            });

            frame.setLayout(null);
            frame.add(label);
            frame.add(button);
            frame.setVisible(true);

    }

    
}