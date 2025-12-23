class BankAccount {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " withdrawing...");
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

class Customer extends Thread {
    BankAccount acc;

    Customer(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        acc.withdraw(700);
    }
}

public class BankThread {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        Customer c1 = new Customer(acc);
        Customer c2 = new Customer(acc);

        c1.start();
        c2.start();
    }
}
