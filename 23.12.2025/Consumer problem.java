class ProducerConsumer {
    int item;
    boolean available = false;

    synchronized void produce(int value) {
        while (available) {
            try { wait(); } catch (Exception e) {}
        }
        item = value;
        available = true;
        System.out.println("Produced: " + item);
        notify();
    }

    synchronized void consume() {
        while (!available) {
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Consumed: " + item);
        available = false;
        notify();
    }
}

class Producer extends Thread {
    ProducerConsumer pc;

    Producer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            pc.produce(i);
        }
    }
}

class Consumer extends Thread {
    ProducerConsumer pc;

    Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            pc.consume();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        new Producer(pc).start();
        new Consumer(pc).start();
    }
}
