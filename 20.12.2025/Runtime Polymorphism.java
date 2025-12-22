class Bank {
    float rate() {
        return 0;
    }
}

class SBI extends Bank {
    float rate() {
        return 8.5f;
    }
}

class ICICI extends Bank {
    float rate() {
        return 7.5f;
    }
}

class TestPolymorphism {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate: " + b.rate());

        b = new ICICI();
        System.out.println("ICICI Rate: " + b.rate());
    }
}
