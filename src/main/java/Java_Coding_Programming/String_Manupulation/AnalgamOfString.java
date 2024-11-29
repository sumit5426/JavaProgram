package Java_Coding_Programming.String_Manupulation;

import java.util.Arrays;

public class AnalgamOfString {
    //if two strings are anagrams means determining if they contain the
    // same characters in the same frequency, but possibly in a different order.
    public static void main(String[] args) {
        String a="selenium";
        String b="senumile";
        char [] m=a.toCharArray();
        char [] n=b.toCharArray();
        Arrays.sort(m);
        Arrays.sort(n);
        if(Arrays.equals(m, n)){
            System.out.println(" it is analgram");
        }
    }
}
