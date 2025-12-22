class Account {
    int balance = 1000;

    synchronized void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
