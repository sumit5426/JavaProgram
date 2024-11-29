package Java_Coding_Programming;

import java.util.ArrayList;
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> number=new ArrayList<>();
        number.add(34);
        number.add(35);
        number.add(8765);
        number.add(121);
        System.out.println(number);
        Iterator<Integer> numiter=number.iterator();
        System.out.println(numiter.next());
        System.out.println(numiter.hasNext());
    }

}
