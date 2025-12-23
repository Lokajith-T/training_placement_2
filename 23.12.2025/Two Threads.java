class EvenOdd {
    int number = 1;
    int limit = 10;

    synchronized void printOdd() {
        while (number <= limit) {
            if (number % 2 == 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.println("Odd: " + number);
                number++;
                notify();
            }
        }
    }

    synchronized void printEven() {
        while (number <= limit) {
            if (number % 2 == 1) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.println("Even: " + number);
                number++;
                notify();
            }
        }
    }
}

public class EvenOddThread {
    public static void main(String[] args) {

        EvenOdd eo = new EvenOdd();

        Thread t1 = new Thread(() -> eo.printOdd());
        Thread t2 = new Thread(() -> eo.printEven());

        t1.start();
        t2.start();
    }
}
