import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        mp.put("amit",20);
        mp.put("suresh",20);
        mp.keySet();
        mp.values();
        System.out.println(mp);
        System.out.println(mp.keySet());
    }
}
