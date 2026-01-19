import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui3 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task-2: Counter App");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Number: 0");
        label.setBounds(110,30,100,30);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        JButton plus = new JButton("+");
        plus.setBounds(60,100,50,30);

        JButton minus = new JButton("-");
        minus.setBounds(160,100,50,30);

        final int[] num = {0};

        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                num[0]++;
                label.setText("Number: " + num[0]);
            }
        });

        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                num[0]--;
                label.setText("Number: " + num[0]);
            }
        });

        frame.add(label);
        frame.add(plus);
        frame.add(minus);
        frame.setVisible(true);
    }
    
}
