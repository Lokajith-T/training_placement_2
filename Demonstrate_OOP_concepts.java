class Person {
    String name;

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int id;

    void display() {   // Method Overriding
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 101;
        s.name = "Lokajith";
        s.display();
    }
}
