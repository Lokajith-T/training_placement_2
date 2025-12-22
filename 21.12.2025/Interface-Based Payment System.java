interface Payment {
    void pay();
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Paid via UPI");
    }
}

class TestPay {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay();
    }
}
