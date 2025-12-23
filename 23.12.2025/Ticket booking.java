class TicketBooking {
    int tickets = 5;

    synchronized void bookTicket() {
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + " booked ticket");
            tickets--;
        } else {
            System.out.println("No tickets available");
        }
    }
}

public class TicketThread {
    public static void main(String[] args) {

        TicketBooking tb = new TicketBooking();

        Runnable r = () -> tb.bookTicket();

        Thread t1 = new Thread(r, "User1");
        Thread t2 = new Thread(r, "User2");
        Thread t3 = new Thread(r, "User3");

        t1.start();
        t2.start();
        t3.start();
    }
}
