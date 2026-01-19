import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


// 🧠 Task 1:

//Ek frame banao jisme ek label aur ek button ho.
//Button dabane par label me text change ho jaye — “Welcome!” se “You clicked the button!”.


public class Gui2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gui2 Frame");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

         // 🎨 Frame background color
        frame.getContentPane().setBackground(Color.LIGHT_GRAY); // Light blue


        JButton button = new JButton("Click me!");
        button.setBounds(20,50,140,30);
        button.setBackground(new Color(0, 102, 204)); // Blue button btn ka bg 
        button.setForeground(Color.WHITE);   //text color  


        JLabel label = new JLabel("Welcome");
        label.setBounds(60,10, 400, 30);
        label.setFont(new Font("Arial", Font.BOLD, 23));
        label.setForeground(Color.RED);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setText("You clicked the button");
            }
        });

        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }
    
}
