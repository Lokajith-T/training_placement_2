import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializeDemo {
    public static void main(String[] args) throws Exception {
        Student s = new Student(1, "Lokajith");

        ObjectOutputStream out =
            new ObjectOutputStream(new FileOutputStream("data.txt"));
        out.writeObject(s);
        out.close();

        System.out.println("Object Serialized");
    }
}
