import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 // ye ek baar me multiple selected krega 


public class Gui9 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Task-7");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JCheckBox javaBox = new JCheckBox("Java");
        javaBox.setBounds(30,100,100,40);

        JCheckBox pythonBox = new JCheckBox("Python");
        pythonBox.setBounds(130,100,100,40);

        JCheckBox cppBox = new JCheckBox("C++");
        cppBox.setBounds(230,100,100,40);

        JLabel label = new JLabel("");
        label.setBounds(50,30,300,500);
        label.setFont(new Font("Arial",Font.BOLD,18));

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String selected = "You selected:  ";

                if(javaBox.isSelected()){

                    selected += "Java";
                }
                else if(pythonBox.isSelected()){

                    selected += "Python";
                }

                else if(cppBox.isSelected()){

                    selected += "C++";
                }

                   
                   
                   label.setText(selected);
            }
        };
        

        javaBox.addActionListener(listener);
        pythonBox.addActionListener(listener);
        cppBox.addActionListener(listener);

        frame.add(label);
        frame.add(javaBox);
        frame.add(pythonBox);
        frame.add(cppBox);
        frame.setVisible(true);

        
    }
    
}
