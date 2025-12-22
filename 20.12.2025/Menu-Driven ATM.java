import java.util.*;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000, choice;

        do {
            System.out.println("1.Deposit 2.Withdraw 3.Balance 4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Amount: ");
                    balance += sc.nextInt();
                    break;
                case 2:
                    System.out.print("Amount: ");
                    int amt = sc.nextInt();
                    if (amt <= balance)
                        balance -= amt;
                    else
                        System.out.println("Insufficient Balance");
                    break;
                case 3:
                    System.out.println("Balance = " + balance);
            }
        } while (choice != 4);
    }
}
