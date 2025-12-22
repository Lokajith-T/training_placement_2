import java.util.*;

class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        for (Map.Entry m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
    }
}
