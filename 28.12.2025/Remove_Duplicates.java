import java.util.*;
class HS1 {
    public static void main(String[] args) {
        int[] a={1,2,2,3};
        HashSet<Integer> s=new HashSet<>();
        for(int i:a) s.add(i);
        System.out.println(s);
    }
}
