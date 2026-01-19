    import javax.swing.*;
    import java.awt.event.*;

    public class SwingExample {
        public static void main(String[] args) {
            JFrame frame = new JFrame("TV Remote Example"); // box bna liya uska name 
            frame.setSize(300, 200); // vs code pr height width onnly
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // iska mtlb ? 
    
            JLabel label = new JLabel("Channel: 1"); // text ya images display krne ke liye 
            label.setBounds(100, 50, 100, 30); // channel jo likh rha hai uski height

            JButton button = new JButton("Next Channel");
            button.setBounds(80, 100, 140, 30);

            button.addActionListener(new ActionListener() { // next channel vala jo btn hai 
                int channel = 1;
                public void actionPerformed(ActionEvent e) {
                    channel++;
                    label.setText("Channel: " + channel);
                }
            });

            frame.setLayout(null); // absolute positioning // ye nhi smjh aaya 
            frame.add(label);// ye sari line smjh nhi aayi 
            frame.add(button);

            frame.setVisible(true);
        }
    }
