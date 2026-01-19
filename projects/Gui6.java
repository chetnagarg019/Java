import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui6 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // First number
        JLabel numLabel1 = new JLabel("First Number:");
        numLabel1.setBounds(40, 40, 100, 30);
        JTextField num1 = new JTextField();
        num1.setBounds(160, 40, 150, 30);

        // Second number
        JLabel numLabel2 = new JLabel("Second Number:");
        numLabel2.setBounds(40, 90, 100, 30);
        JTextField num2 = new JTextField();
        num2.setBounds(160, 90, 150, 30);

        // Buttons
        JButton plus = new JButton("+");
        plus.setBounds(40, 150, 60, 30);

        JButton minus = new JButton("-");
        minus.setBounds(110, 150, 60, 30);

        JButton multi = new JButton("*");
        multi.setBounds(180, 150, 60, 30);

        JButton divide = new JButton("/");
        divide.setBounds(250, 150, 60, 30);

        // Result label
        JLabel resultJLabel = new JLabel("Result:");
        resultJLabel.setFont(new Font("Arial", Font.BOLD, 14));
        resultJLabel.setBounds(40, 210, 300, 30);

        // Add components to frame
        frame.add(numLabel1);
        frame.add(num1);
        frame.add(numLabel2);
        frame.add(num2);
        frame.add(plus);
        frame.add(minus);
        frame.add(multi);
        frame.add(divide);
        frame.add(resultJLabel);

        // Action Listeners
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                double result = a + b;
                resultJLabel.setText("Result: " + result);
            }
        });

        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                double result = a - b;
                resultJLabel.setText("Result: " + result);
            }
        });

        multi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                double result = a * b;
                resultJLabel.setText("Result: " + result);
            }
        });

        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                if (b == 0)
                    resultJLabel.setText("Result: Cannot divide by 0!");
                else {
                    double result = a / b;
                    resultJLabel.setText("Result: " + result);
                }
            }
        });

        frame.setVisible(true);
    }
}
