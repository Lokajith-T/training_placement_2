import java.util.*;
class HS4 {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        s.add(1); s.add(2);
        ArrayList<Integer> a=new ArrayList<>(s);
        System.out.println(a);
    }
}
