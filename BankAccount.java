import java.util.Scanner;

class BankAccount{

    // Private data members 
    private int accountNo;
    private String name;
    private int balance;      

    
    BankAccount(int accNo, String n, int bal) {
        accountNo = accNo;
        name = n;
        balance = bal;
    }

    
    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        } else {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully!");
        }
    }

    
    public void display() {
        System.out.println("\nAccount Details:");
        System.out.println("Account No: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Current Balance: " + balance);
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Program coded by Aditya Singh, 2400320100094");

       
        BankAccount acc = new BankAccount(101, "Aditya", 500000);

        int choice;
        int amount;

        do {
            System.out.println(" Bank Menu ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextInt();
                    acc.deposit(amount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextInt();
                    acc.withdraw(amount);
                    break;

                case 3:
                    acc.display();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

