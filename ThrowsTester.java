class NegativeAmountException extends Exception {

    public NegativeAmountException(String message) {
        super(message);
    }

}

class ATM {
    private int balance = 50000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amt) throws Exception {
        System.out.println("Deposit :" + amt);
        if (amt < 0) {
            throw new NegativeAmountException("-ve amount is invalid to deposit");
        }
        balance += amt;
    }

    public void withdraw(int amt) throws Exception {
        System.out.println("Withdraw :" + amt);
        // amt = amt/0;
        if (amt <= 0) {
            throw new Exception("-ve amount is invalid to withdraw");
        }
        if (amt > balance) {
            System.out.println("insufficient Balance");
        } else {
            balance -= amt;
        }
    }
}

public class ThrowsTester {
    public static void main(String[] args) {
        try {
            ATM a1 = new ATM();
            System.out.println("Balanace :" + a1.getBalance());
            a1.deposit(2000);
            System.out.println("Balanace :" + a1.getBalance());
            a1.withdraw(50000);
            System.out.println("Balanace :" + a1.getBalance());

        } catch (NegativeAmountException ex) {
            System.out.println(ex.getMessage());

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally reached to end");
        }
    }
}
