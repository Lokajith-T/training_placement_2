class Shared {
    synchronized void show() {
        try {
            wait();
            System.out.println("Thread resumed");
        } catch (Exception e) {}
    }

    synchronized void notifyThread() {
        notify();
    }
}

public class InterThread {
    public static void main(String[] args) {

        Shared s = new Shared();

        new Thread(() -> s.show()).start();

        new Thread(() -> {
            try { Thread.sleep(1000); } catch (Exception e) {}
            s.notifyThread();
        }).start();
    }
}
