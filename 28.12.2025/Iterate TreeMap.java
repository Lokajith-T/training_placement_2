import java.util.*;
class TM4 {
    public static void main(String[] args) {
        TreeMap<Integer,String> t=new TreeMap<>();
        t.put(2,"B"); t.put(1,"A");
        t.forEach((k,v)->System.out.println(k+" "+v));
    }
}
