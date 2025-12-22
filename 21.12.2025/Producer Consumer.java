class PC {
    int n;
    synchronized void put(int n) {
        this.n = n;
        System.out.println("Produced " + n);
    }
    synchronized void get() {
        System.out.println("Consumed " + n);
    }
}
