import java.util.*;
class HM4 {
    public static void main(String[] args) {
        HashMap<Integer,String> m=new HashMap<>();
        m.put(1,"A"); m.remove(1);
        System.out.println(m);
    }
}
