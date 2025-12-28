import java.util.*;
class HM3 {
    public static void main(String[] args) {
        HashMap<Integer,String> m=new HashMap<>();
        m.put(1,"A"); m.put(2,"B");
        for(Map.Entry<Integer,String> e:m.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }
}
