import java.util.*;

public class BookStore {
    public static void main(String[] args) {

        HashMap<Integer, String> books = new HashMap<>();

        books.put(1, "Java");
        books.put(2, "Python");
        books.put(3, "C++");

        for (Map.Entry<Integer, String> entry : books.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        int searchId = 2;
        System.out.println("Book Found: " + books.get(searchId));
    }
}
