import java.util.*;

class Student {
    int roll;
    String name;
    int marks;

    Student(int r, String n, int m) {
        roll = r;
        name = n;
        marks = m;
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Adding students
        list.add(new Student(1, "Arun", 85));
        list.add(new Student(2, "Bala", 92));
        list.add(new Student(3, "Charan", 78));

        // Display students
        System.out.println("Student Details:");
        for (Student s : list) {
            System.out.println(s.roll + " " + s.name + " " + s.marks);
        }

        // Search student
        System.out.print("Enter roll to search: ");
        int r = sc.nextInt();

        for (Student s : list) {
            if (s.roll == r) {
                System.out.println("Found: " + s.name + " " + s.marks);
            }
        }

        // Sort by marks
        list.sort((a, b) -> b.marks - a.marks);

        System.out.println("After Sorting by Marks:");
        for (Student s : list) {
            System.out.println(s.roll + " " + s.name + " " + s.marks);
        }
    }
}
