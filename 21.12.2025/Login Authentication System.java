class Login {
    public static void main(String[] args) {
        String user = "admin";
        String pass = "1234";

        if (user.equals("admin") && pass.equals("1234"))
            System.out.println("Login Successful");
        else
            System.out.println("Invalid Login");
    }
}
