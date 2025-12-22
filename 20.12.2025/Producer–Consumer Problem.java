class Test {
    int value;
    synchronized void put(int v) {
        value = v;
        System.out.println("Produced " + value);
    }
    synchronized int get() {
        System.out.println("Consumed " + value);
        return value;
    }
}
