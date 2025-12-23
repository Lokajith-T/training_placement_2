import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Ravi", 30000));
        list.add(new Employee(102, "Kumar", 40000));

        // Display
        for (Employee e : list) {
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }

        // Search
        int searchId = 101;
        for (Employee e : list) {
            if (e.id == searchId) {
                System.out.println("Employee Found: " + e.name);
            }
        }

        // Delete
        list.removeIf(e -> e.id == 102);

        System.out.println("After Deletion:");
        for (Employee e : list) {
            System.out.println(e.id + " " + e.name);
        }
    }
}
