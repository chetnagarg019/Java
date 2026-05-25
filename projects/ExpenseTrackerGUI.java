import javax.swing.*;
import java.awt.*;
import java.util.ArrayList; //real

class Transaction {
    String type, category, date;
    double amount;

    Transaction(String type, String category, double amount, String date) {
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.date = date; 
    }

    public String toString() { 
        return type + " | " + category + " | " + amount + " | " + date;
    }
   
}

class ExpenseTrackerLogic {
    ArrayList<Transaction> list = new ArrayList<>();
    void add(Transaction t) { list.add(t); }
    ArrayList<Transaction> getList() { return list; }

    double getIncome() {
        double income = 0;
        for (Transaction t : list)
            if (t.type.equalsIgnoreCase("Income")) income += t.amount;
        return income;
    }

    double getExpense() {
        double expense = 0;
        for (Transaction t : list)
            if (t.type.equalsIgnoreCase("Expense")) expense += t.amount;
        return expense;
    }
}
 
public class ExpenseTrackerGUI { 
    public static void main(String[] args) {
        ExpenseTrackerLogic et = new ExpenseTrackerLogic();

        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Expense Tracker");
            frame.setSize(600, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.getContentPane().setBackground(new Color(230, 240, 255));

            // Labels
            JLabel typeLabel = new JLabel("Type:");
            typeLabel.setBounds(50, 30, 100, 25);
            frame.add(typeLabel);

            JLabel catLabel = new JLabel("Category:");
            catLabel.setBounds(50, 70, 100, 25);
            frame.add(catLabel);

            JLabel amtLabel = new JLabel("Amount:");
            amtLabel.setBounds(50, 110, 100, 25);
            frame.add(amtLabel);

            JLabel dateLabel = new JLabel("Date (YYYY-MM-DD):");
            dateLabel.setBounds(50, 150, 150, 25);
            frame.add(dateLabel);

            // Input fields
            String[] types = {"Income", "Expense"};
            JComboBox<String> typeBox = new JComboBox<>(types);
            typeBox.setBounds(200, 30, 150, 25);
            frame.add(typeBox);

            JTextField catField = new JTextField();
            catField.setBounds(200, 70, 150, 25);
            frame.add(catField);

            JTextField amtField = new JTextField();
            amtField.setBounds(200, 110, 150, 25);
            frame.add(amtField);

            JTextField dateField = new JTextField();
            dateField.setBounds(200, 150, 150, 25);
            frame.add(dateField);

            // Buttons
            JButton addBtn = new JButton("Add Transaction");
            addBtn.setBounds(400, 30, 150, 40);
            addBtn.setBackground(new Color(0, 102, 204));
            addBtn.setForeground(Color.WHITE);
            frame.add(addBtn);

            JButton viewBtn = new JButton("View All");
            viewBtn.setBounds(400, 80, 150, 40);
            viewBtn.setBackground(new Color(0, 153, 76));
            viewBtn.setForeground(Color.WHITE);
            frame.add(viewBtn);

            JButton reportBtn = new JButton("Generate Report");
            reportBtn.setBounds(400, 130, 150, 40);
            reportBtn.setBackground(new Color(204, 0, 0));
            reportBtn.setForeground(Color.WHITE);
            frame.add(reportBtn);

            // Display area inside scroll pane
            JTextArea display = new JTextArea();
            display.setEditable(false);
            display.setFont(new Font("Monospaced", Font.PLAIN, 12));
            display.setBackground(new Color(245, 245, 245));

            JScrollPane scroll = new JScrollPane(display);
            scroll.setBounds(50, 200, 500, 200);
            frame.add(scroll); 

            // Add Transaction
            addBtn.addActionListener(e -> {
                String type = (String) typeBox.getSelectedItem();
                String cat = catField.getText().trim();
                String amtText = amtField.getText().trim();
                String date = dateField.getText().trim();

                if (cat.isEmpty() || amtText.isEmpty() || date.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields", "Input error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double amt;
                try {
                    amt = Double.parseDouble(amtText);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Enter a valid numeric amount", "Input error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                et.add(new Transaction(type, cat, amt, date));
                JOptionPane.showMessageDialog(frame, "Transaction Added!");
                catField.setText(""); amtField.setText(""); dateField.setText("");
            });

            // View All Transactions
            viewBtn.addActionListener(e -> {
                System.out.println("View clicked, transactions: " + et.getList());
                display.setText(""); // clear previous
                for (Transaction t : et.getList()) {
                    display.append(t + "\n");
                }
            });

            // Generate Report
            reportBtn.addActionListener(e -> {
                double income = et.getIncome();
                double expense = et.getExpense();
                display.setText(String.format("Total Income: %.2f\nTotal Expense: %.2f\nBalance: %.2f", income, expense, income - expense));
            });

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            
        });
    }
    
}

