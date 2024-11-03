package Locator;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharInString {
    public static void main(String[] args) {
        String a = "sumit sekhar";
        Set<Character> ch = new LinkedHashSet<>();
        StringBuffer bf = new StringBuffer();
        char[] c = a.toCharArray();
        for (char d : c) {
            ch.add(d);
        }
        for (char f : ch) {
            bf.append(f); //here we can use .get() because it is not index base
        }

        System.out.println(bf);


    }

}
