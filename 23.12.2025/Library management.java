import java.util.*;

class Book {
    int id;
    String name;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book(1, "Java"));
        list.add(new Book(2, "Python"));

        for (Book b : list) {
            System.out.println(b.id + " " + b.name);
        }
    }
}
