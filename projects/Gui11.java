import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui11 {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Task-11");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // JLabel Cel = new JLabel("C value:");
        // Cel.setBounds(20,160,130,50);
        
        JLabel celLabel = new JLabel("Celsius:");
        celLabel.setBounds(40, 40, 100, 30);
        
        JTextField cvalue = new JTextField();
        cvalue.setBounds(120,40,150,30);



        JButton convert = new JButton("Convert");
        convert.setBounds(100,90,130,40);

         JLabel resultJLabel = new JLabel("Result:");
        resultJLabel.setFont(new Font("Arial", Font.BOLD, 14));
        resultJLabel.setBounds(40, 140, 300, 30);

        convert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{

                    double c = Double.parseDouble(cvalue.getText());    
                    double result = (c * 9/5) + 32;
                    resultJLabel.setText("Result is:" + result);
                }catch(NumberFormatException ex){
                    resultJLabel.setText("please enter a valid number");
                }
            }
        });

        frame.add(resultJLabel);
        frame.add(cvalue);
        frame.add(convert);
        frame.add(celLabel);
        frame.setVisible(true);





        
    }
    
}
