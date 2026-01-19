import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;




public class Gui14 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("To-do list");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField taskField = new JTextField();
        taskField.setBounds(130, 250, 180, 30);
          frame.add(taskField);

        JButton addTask = new JButton("Add Task");
        addTask.setBounds(80, 300, 100, 30);
        frame.add(addTask);

          // ---------- List Model & JList ----------
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> taskList = new JList<>(model);


        
        JScrollPane scroll = new JScrollPane(taskList);
        scroll.setBounds(50, 50, 290, 180);
        frame.add(scroll);

        JButton removeTask = new JButton("remove Task");
        removeTask.setBounds(200, 300, 120, 30);
        frame.add(removeTask);


 
        addTask.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                String task = taskField.getText().trim();
                if(!task.isEmpty()){
                    model.addElement(task);
                    taskField.setText(""); // clr field
                }else{
                    JOptionPane.showMessageDialog(frame,"Please enter a task!");
                }

            }
        });


        removeTask.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                 int index = taskList.getSelectedIndex();
                if (index != -1) {
                    model.remove(index); // Remove selected task
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a task to remove!");
                }
            }
        });


        frame.getContentPane().setBackground(new Color(230, 240, 255));
        frame.setVisible(true);


        
    }
    
}
