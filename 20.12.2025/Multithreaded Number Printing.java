class NumberPrinter {
    synchronized void print(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

class ThreadA extends Thread {
    NumberPrinter p;
    ThreadA(NumberPrinter p) {
        this.p = p;
    }
    public void run() {
        p.print(5);
    }
}

class ThreadB extends Thread {
    NumberPrinter p;
    ThreadB(NumberPrinter p) {
        this.p = p;
    }
    public void run() {
        p.print(10);
    }
}

class SyncDemo {
    public static void main(String[] args) {
        NumberPrinter obj = new NumberPrinter();
        new ThreadA(obj).start();
        new ThreadB(obj).start();
    }
}
