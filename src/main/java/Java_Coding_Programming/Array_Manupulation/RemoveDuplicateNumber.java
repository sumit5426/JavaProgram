package Java_Coding_Programming.Array_Manupulation;

import java.util.*;

public class RemoveDuplicateNumber {
    public static void main(String[] args) {
        Integer a[] = {23, 45, 67, 64, 678, 45, 89, 76};
        Set<Integer> duplicateremove = new LinkedHashSet<>();
        Collections.addAll(duplicateremove, a);
        System.out.println(duplicateremove);
    }
}
