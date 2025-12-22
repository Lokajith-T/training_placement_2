class Voting {
    static void vote(int age) throws Exception {
        if (age < 18)
            throw new Exception("Not Eligible");
        System.out.println("Vote Registered");
    }

    public static void main(String[] args) {
        try {
            vote(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
