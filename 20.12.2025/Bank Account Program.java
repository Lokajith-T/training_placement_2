class BankAccount {
    private int balance = 1000;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(500);
        b.withdraw(300);
        b.showBalance();
    }
}
