import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Gui8 {
    public static void main(String[] args) {

        
        JFrame frame = new JFrame("Task-7");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Watch my color!");
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setBounds(120, 100, 200, 30);

        String[] colors = {"Red","Green","Orange","Yellow"};
        JComboBox colorBox = new JComboBox(colors);
        colorBox.setBounds(40,150,130,40);


        colorBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                String selectedColor = (String)  colorBox.getSelectedItem();

                if(selectedColor.equals("Red")){
                    label.setForeground(Color.RED);
                }else if(selectedColor.equals("Green")){
                    label.setForeground(Color.GREEN);
                }else if(selectedColor.equals("Orange")){
                    label.setForeground(Color.ORANGE);
                }else if(selectedColor.equals("Yellow")){
                    label.setForeground(Color.YELLOW);
                }

            }
        });

        frame.add(colorBox);
        // frame.add(ComboBox);
        frame.add(label);
        frame.setVisible(true);



        
    }
    
}
