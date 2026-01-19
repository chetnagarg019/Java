import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui7 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Task-7");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //3 btns create here red green blue 
        JButton Rbtn = new JButton("Red");
        Rbtn.setBounds(50, 100, 80, 30);

        JButton Gbtn = new JButton("Green");
        Gbtn.setBounds(160, 100, 80, 30);

        JButton Bbtn = new JButton("Blue");
        Bbtn.setBounds(270, 100, 80, 30);

        // Rbtn.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e){
        //          frame.getContentPane().setBackground(Color.RED); // Light blue
        //     }
        // });

        //  Gbtn.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e){
        //          frame.getContentPane().setBackground(Color.GREEN); // Light blue
        //     }
        // });

        //  Bbtn.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e){
        //          frame.getContentPane().setBackground(Color.BLUE); // Light blue
        //     }
        // });

      
        ActionListener colorChange = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == Rbtn){
                    frame.getContentPane().setBackground(Color.RED);
                }else if(e.getSource() == Bbtn){
                    frame.getContentPane().setBackground(Color.BLUE);
               
                }else if(e.getSource() == Gbtn){
                   frame.getContentPane().setBackground(Color.GREEN);
               
                }
            }
        };

        Bbtn.addActionListener(colorChange);
        Gbtn.addActionListener(colorChange);
        Rbtn.addActionListener(colorChange);
        


        frame.add(Bbtn);
        frame.add(Rbtn);
        frame.add(Gbtn);
        frame.setVisible(true);




        // frame.getContentPane().setBackground(Color.LIGHT_GRAY); // Light blue

        
    }
    
}
