import java.util.*;

class StudentResult {
    int regNo;
    String name;
    int m1, m2, m3;
    int total;
    float avg;
    String result;

    void calculate() {
        total = m1 + m2 + m3;
        avg = total / 3.0f;
        result = (m1 >= 35 && m2 >= 35 && m3 >= 35) ? "PASS" : "FAIL";
    }

    void display() {
        System.out.println(regNo + " " + name + " " + total + " " + avg + " " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentResult s = new StudentResult();

        System.out.print("Reg No: ");
        s.regNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        s.name = sc.nextLine();
        System.out.print("Marks (3 subjects): ");
        s.m1 = sc.nextInt();
        s.m2 = sc.nextInt();
        s.m3 = sc.nextInt();

        s.calculate();
        s.display();
    }
}
