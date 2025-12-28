import java.util.*;
class TM3 {
    public static void main(String[] args) {
        TreeMap<Integer,String> t=new TreeMap<>();
        t.put(1,"A"); t.put(3,"C");
        System.out.println(t.firstKey());
        System.out.println(t.lastKey());
    }
}
