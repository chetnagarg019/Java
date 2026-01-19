
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Gui12 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Image Changer");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        frame.setLayout(null);

        JLabel imageLabel = new JLabel();
        imageLabel.setBounds(50, 50, 300, 200);

        try {
            // Images from URLs
            URL url1 = new URL("https://cdn.pixabay.com/photo/2025/06/11/14/25/ai-generated-9654597_1280.png");
            URL url2 = new URL("https://cdn.pixabay.com/photo/2023/05/20/21/11/ai-generated-8007368_1280.jpg");

            ImageIcon img1 = new ImageIcon(url1); //ImageIcon ek class hai jo image ko GUI me dikhati hai
            ImageIcon img2 = new ImageIcon(url2);

            // Resize images to fit the label
            Image scaled1 = img1.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
            Image scaled2 = img2.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);

            ImageIcon finalImg1 = new ImageIcon(scaled1);
            ImageIcon finalImg2 = new ImageIcon(scaled2);

            imageLabel.setIcon(finalImg1);

            JButton changeBtn = new JButton("Change Image");
            changeBtn.setBounds(120, 280, 150, 40);

            changeBtn.addActionListener(new ActionListener() {
                boolean toggle = false;

                public void actionPerformed(ActionEvent e) {
                    if (toggle) {
                        imageLabel.setIcon(finalImg1);
                    } else {
                        imageLabel.setIcon(finalImg2);
                    }
                    toggle = !toggle;
                }
            });

            frame.add(imageLabel);
            frame.add(changeBtn);

        } catch (Exception ex) {
            System.out.println("Error loading image: " + ex.getMessage());
        }

        frame.setVisible(true);
    }
}
