class Countdown extends Thread {
    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
            try { sleep(1000); } catch (Exception e) {}
        }
    }
    public static void main(String[] args) {
        new Countdown().start();
    }
}
