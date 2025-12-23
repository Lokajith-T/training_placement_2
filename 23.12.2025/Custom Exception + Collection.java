import java.util.*;

class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class MarksCheck {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(90);
        marks.add(110);

        for (int m : marks) {
            try {
                if (m > 100)
                    throw new InvalidMarksException("Marks cannot exceed 100");
                System.out.println("Marks: " + m);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
