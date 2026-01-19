import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui5 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Task-5");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Username Label + Field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(30, 30, 100, 30);
        JTextField name = new JTextField();
        name.setBounds(130, 30, 150, 30);

        // Password Label + Field
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(30, 80, 100, 30);
        JPasswordField password = new JPasswordField();
        password.setBounds(130, 80, 150, 30);

        // Login Button
        JButton button = new JButton("Login");
        button.setBounds(110, 130, 100, 30);

        // Button Click Action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = name.getText();
                String pass = new String(password.getPassword()); // getPassword jo method hai vo string return nhi krta char arr return krta hai usko string me convert krne ke liye new String likhna pdta hai

                if (user.equals("admin") && pass.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid credentials");
                }
            }
        });

        // Add all components
        frame.add(userLabel);
        frame.add(name);
        frame.add(passLabel);
        frame.add(password);
        frame.add(button);

        frame.setVisible(true);
    }
}
