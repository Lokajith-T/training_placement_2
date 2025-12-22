class Email {
    public static void main(String[] args) {
        String e = "test@gmail.com";
        if (e.contains("@") && e.endsWith(".com"))
            System.out.println("Valid Email");
    }
}
