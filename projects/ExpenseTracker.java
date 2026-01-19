import java.util.*;

class Transaction {
    String type, category, date;
    double amount;


    //construcctor hai ye ek 
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

    void view() {
        for (Transaction t : list) System.out.println(t);
    }

    void report() {
        double income = 0, expense = 0;
        for (Transaction t : list) {
            if (t.type.equalsIgnoreCase("Income")) income += t.amount;
            else expense += t.amount;
        }
        System.out.println("Total Income: " + income);
        System.out.println("Total Expense: " + expense);
        System.out.println("Balance: " + (income - expense));
    }
}

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseTrackerLogic et = new ExpenseTrackerLogic();
        while (true) {
            System.out.println("\n1. Add Transaction");
            System.out.println("2. View All");
            System.out.println("3. Generate Report");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Type (Income/Expense): ");
                String type = sc.nextLine();
                System.out.print("Category: ");
                String cat = sc.nextLine();
                System.out.print("Amount: ");
                double amt = sc.nextDouble();
                sc.nextLine();
                System.out.print("Date (YYYY-MM-DD): ");
                String date = sc.nextLine();
                et.add(new Transaction(type, cat, amt, date));
            } else if (ch == 2) {
                et.view();
            } else if (ch == 3) {
                et.report();
            } else if (ch == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid Choice!");
            }
        }
        sc.close();
    }
}
