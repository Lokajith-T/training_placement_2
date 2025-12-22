class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

class Voting {
    static void checkAge(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
