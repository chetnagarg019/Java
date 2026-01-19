import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// or ye ek baar me sirf ek hi langiage ko select krega.. 


public class Gui10 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Task-10");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JRadioButton javabtn = new JRadioButton("Java");
        javabtn.setBounds(30,100,100,40);

        JRadioButton pythonbtn = new JRadioButton("Python");
        pythonbtn.setBounds(130,100,100,40);

        JRadioButton cbtn = new JRadioButton("C");
        cbtn.setBounds(230,100,100,40);

        JLabel label = new JLabel("");
        label.setBounds(100,100,200,500);
        label.setFont(new Font("Arial", Font.BOLD, 16));


        ButtonGroup group = new ButtonGroup();
        group.add(javabtn);
        group.add(pythonbtn);
        group.add(cbtn);

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(javabtn.isSelected())
                {
                    label.setText("Java is selected:");
                }else if(pythonbtn.isSelected()){
                    label.setText("Python is selected");
                }else if(cbtn.isSelected()){
                    label.setText("C is selected");
                }
                
            }
        };

        javabtn.addActionListener(listener);
        pythonbtn.addActionListener(listener);
        cbtn.addActionListener(listener);


        frame.add(label);
        frame.add(javabtn);
        frame.add(cbtn);
        frame.add(pythonbtn);
        frame.setVisible(true);
        

    }
    
}

