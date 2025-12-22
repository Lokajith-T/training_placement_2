class ATM {
    int balance = 5000;

    void withdraw(int amt) {
        if (amt <= balance)
            balance -= amt;
    }

    void show() {
        System.out.println("Balance = " + balance);
    }

    public static void main(String[] args) {
        ATM a = new ATM();
        a.withdraw(1000);
        a.show();
    }
}
