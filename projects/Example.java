// ...existing code...
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

class Bank {
    private String accHolName;
    private String accNum;
    private double bal;

    public Bank(String accHolName, String accNum, double bal) {
        this.accHolName = accHolName;
        this.accNum = accNum;
        this.bal = bal;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            bal += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive");
            return;
        }
        if (amount <= bal) {
            bal -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else {
            System.out.println("Unable to process: Low account balance");
        }
    }

    public double checkBal() {
        return bal;
    }

    public void display() {
        System.out.println("Account holder name: " + accHolName);
        System.out.println("Account number: " + accNum);
        System.out.println("Current balance: " + bal);
    }
}

// ...existing code...
public class Example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account holder name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter Account number: ");
        String num = sc.nextLine().trim();

        Bank bank = new Bank(name, num, 0.0);
        System.out.println("Account created successfully");

        while (true) {
            System.out.println("\n=== Bank Menu ===");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. View Balance");
            System.out.println("4. Display Details");
            System.out.println("5. Exit");
            System.out.print("Enter a choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next(); // consume invalid token
                continue;
            }
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depAmt = sc.nextDouble();
                    bank.deposit(depAmt);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withAmt = sc.nextDouble();
                    bank.withdraw(withAmt);
                    break;
                case 3:
                    System.out.println("Your balance is: " + bank.checkBal());
                    break;
                case 4:
                    System.out.println("Your Details:");
                    bank.display();
                    break;
                case 5:
                    System.out.println("Thank your for visiting");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
 }

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// class Bank {
//     private String accHolName;
//     private String accNum;
//     private double bal;

//     public Bank(String accHolName, String accNum, double bal) {
//         this.accHolName = accHolName;
//         this.accNum = accNum;
//         this.bal = bal;
//     }

//     public void deposit(double amount) {
//         if (amount > 0) bal += amount;
//         else throw new IllegalArgumentException("Amount must be positive");
//     }

//     public void withdraw(double amount) {
//         if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
//         if (amount > bal) throw new IllegalArgumentException("Insufficient balance");
//         bal -= amount;
//     }

//     public double getBalance() {
//         return bal;
//     }

//     public String getDetails() {
//         return "👤 Name: " + accHolName + "\n🏦 Account No: " + accNum + "\n💰 Balance: ₹" + bal;
//     }
// }

// public class BankModernUI extends JFrame implements ActionListener {
//     private JTextField nameField, accNumField, amountField;
//     private JTextArea outputArea;
//     private JButton createBtn, depositBtn, withdrawBtn, balanceBtn, detailsBtn, clearBtn;
//     private Bank bank;

//     public BankModernUI() {
//         // 🔹 Frame setup
//         setTitle("💳 Smart Bank App");
//         setSize(600, 500);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);
//         setLayout(null);
//         getContentPane().setBackground(new Color(245, 248, 255));

//         // 🔹 Title Label
//         JLabel title = new JLabel("Smart Bank Management System", JLabel.CENTER);
//         title.setFont(new Font("Segoe UI", Font.BOLD, 20));
//         title.setForeground(new Color(30, 60, 114));
//         title.setBounds(80, 15, 440, 40);
//         add(title);

//         // 🔹 Input fields panel
//         JPanel formPanel = new JPanel();
//         formPanel.setLayout(new GridLayout(3, 2, 10, 10));
//         formPanel.setBounds(100, 70, 400, 120);
//         formPanel.setBackground(new Color(245, 248, 255));

//         JLabel nameLbl = new JLabel("Account Holder:");
//         JLabel accLbl = new JLabel("Account Number:");
//         JLabel amtLbl = new JLabel("Amount:");

//         nameField = new JTextField();
//         accNumField = new JTextField();
//         amountField = new JTextField();

//         formPanel.add(nameLbl); formPanel.add(nameField);
//         formPanel.add(accLbl);  formPanel.add(accNumField);
//         formPanel.add(amtLbl);  formPanel.add(amountField);
//         add(formPanel);

//         // 🔹 Buttons panel
//         JPanel btnPanel = new JPanel(new GridLayout(2, 3, 10, 10));
//         btnPanel.setBounds(70, 210, 450, 100);
//         btnPanel.setBackground(new Color(245, 248, 255));

//         createBtn = makeButton("Create");
//         depositBtn = makeButton("Deposit");
//         withdrawBtn = makeButton("Withdraw");
//         balanceBtn = makeButton("Check Balance");
//         detailsBtn = makeButton("Details");
//         clearBtn = makeButton("Clear");

//         btnPanel.add(createBtn);
//         btnPanel.add(depositBtn);
//         btnPanel.add(withdrawBtn);
//         btnPanel.add(balanceBtn);
//         btnPanel.add(detailsBtn);
//         btnPanel.add(clearBtn);

//         add(btnPanel);

//         // 🔹 Output area
//         outputArea = new JTextArea();
//         outputArea.setEditable(false);
//         outputArea.setFont(new Font("Consolas", Font.PLAIN, 14));
//         outputArea.setBackground(new Color(255, 255, 255));
//         outputArea.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 255), 2));
//         JScrollPane scroll = new JScrollPane(outputArea);
//         scroll.setBounds(100, 330, 400, 100);
//         add(scroll);

//         // 🔹 Event handling
//         for (JButton b : new JButton[]{createBtn, depositBtn, withdrawBtn, balanceBtn, detailsBtn, clearBtn})
//             b.addActionListener(this);

//         setVisible(true);
//     }

//     private JButton makeButton(String text) {
//         JButton btn = new JButton(text);
//         btn.setFocusPainted(false);
//         btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
//         btn.setBackground(new Color(80, 120, 200));
//         btn.setForeground(Color.white);
//         btn.setBorder(BorderFactory.createEmptyBorder(8, 10, 8, 10));
//         btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//         return btn;
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         Object src = e.getSource();

//         try {
//             if (src == createBtn) {
//                 String name = nameField.getText().trim();
//                 String num = accNumField.getText().trim();
//                 if (name.isEmpty() || num.isEmpty())
//                     JOptionPane.showMessageDialog(this, "Please fill both Name and Account Number!");
//                 else {
//                     bank = new Bank(name, num, 0.0);
//                     outputArea.setText("✅ Account created successfully!\n\n" + bank.getDetails());
//                 }
//             } 
//             else if (src == depositBtn) {
//                 if (bank == null) throw new Exception("Create an account first!");
//                 double amt = Double.parseDouble(amountField.getText());
//                 bank.deposit(amt);
//                 outputArea.setText("💸 Deposit Successful!\nNew Balance: ₹" + bank.getBalance());
//             }
//             else if (src == withdrawBtn) {
//                 if (bank == null) throw new Exception("Create an account first!");
//                 double amt = Double.parseDouble(amountField.getText());
//                 bank.withdraw(amt);
//                 outputArea.setText("💰 Withdrawal Successful!\nNew Balance: ₹" + bank.getBalance());
//             }
//             else if (src == balanceBtn) {
//                 if (bank == null) throw new Exception("Create an account first!");
//                 outputArea.setText("💵 Current Balance: ₹" + bank.getBalance());
//             }
//             else if (src == detailsBtn) {
//                 if (bank == null) throw new Exception("Create an account first!");
//                 outputArea.setText(bank.getDetails());
//             }
//             else if (src == clearBtn) {
//                 nameField.setText("");
//                 accNumField.setText("");
//                 amountField.setText("");
//                 outputArea.setText("");
//             }
//         } catch (NumberFormatException ex) {
//             JOptionPane.showMessageDialog(this, "Enter a valid amount!");
//         } catch (Exception ex) {
//             JOptionPane.showMessageDialog(this, ex.getMessage());
//         }
//     }

//     public static void main(String[] args) {
//         new BankModernUI();
//     }
// }

