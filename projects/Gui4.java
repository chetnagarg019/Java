import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Gui4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Task-4");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField text = new JTextField("");
        text.setBounds(30,40,150,30);
        text.setFont(new Font("Arial",Font.BOLD,18));


        JButton button = new JButton("Click me!");
        button.setBounds(30,80,100,30);

        // JLabel label = new JLabel("Enter");
        // lebel.setBounds(50,60,100,30);

        JLabel label = new JLabel(""); // text ya images display krne ke liye 
        label.setBounds(30, 120, 200, 30); // channel jo likh rha hai uski height


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String userText = text.getText();
                label.setText(userText);
            }
        });


        frame.add(label);
        frame.add(text);
        frame.add(button);
        frame.setVisible(true);

      



    }
    
}
