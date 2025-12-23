import java.util.*;

class Student {
    int roll;
    int marks;

    Student(int r, int m) {
        roll = r;
        marks = m;
    }
}

public class SortMarks {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, 78));
        list.add(new Student(2, 90));
        list.add(new Student(3, 65));

        Collections.sort(list, (a, b) -> b.marks - a.marks);

        for (Student s : list) {
            System.out.println(s.roll + " " + s.marks);
        }
    }
}
