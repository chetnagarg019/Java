import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui13 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Form");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel namLabel = new JLabel("Name:");
        namLabel.setBounds(30,30,100,30);
        JTextField name = new JTextField();
        name.setBounds(150,30,150,30);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(30,80,100,30);
        JTextField age = new JTextField();
        age.setBounds(150,80,150,30);

        JLabel classLabel = new JLabel("Class:");
        classLabel.setBounds(30,130,100,30);
        JTextField classField = new JTextField();
        classField.setBounds(150,130,150,30); 

        JLabel subjectLabel = new JLabel("Subject:");
        subjectLabel.setBounds(30,180,100,30);
        String[] subjects = {"Physics","Chemistry","Maths"};
        JComboBox<String> subjectBox = new JComboBox<>(subjects);
        subjectBox.setBounds(150,180,150,30);

        JButton submit = new JButton("Submit");
        submit.setBounds(130,230,100,40);

        JLabel resultJLabel = new JLabel("Result:");
        resultJLabel.setFont(new Font("Arial", Font.BOLD, 14));
        resultJLabel.setBounds(30,290,300,250);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String studentName = name.getText();
                String studentAge = age.getText();
                String studentClass = classField.getText();
                String subject = (String) subjectBox.getSelectedItem();

                resultJLabel.setText("<html>Name: " + studentName +
                                     "<br>Age: " + studentAge +
                                     "<br>Class: " + studentClass +
                                     "<br>Subject: " + subject + "</html>");
            }
        });

        frame.add(subjectLabel);
        frame.add(subjectBox);
        frame.add(submit);
        frame.add(resultJLabel);
        frame.add(classField);
        frame.add(classLabel);
        frame.add(namLabel);
        frame.add(name);
        frame.add(ageLabel);
        frame.add(age);
        frame.setVisible(true);
    }
}
