import java.util.*;
class TM2 {
    public static void main(String[] args) {
        TreeMap<Integer,String> t=new TreeMap<>(Collections.reverseOrder());
        t.put(1,"A"); t.put(2,"B");
        System.out.println(t);
    }
}
