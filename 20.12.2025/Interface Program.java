interface Printable {
    void print();
}

interface Showable {
    void show();
}

class TestInterface implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }

    public static void main(String[] args) {
        TestInterface t = new TestInterface();
        t.print();
        t.show();
    }
}
