package Java_Coding_Programming.Array_Manupulation;

import java.util.ArrayList;

public class EvenAndOddSide {
    public static void main(String[] args) {
        int[] a={23,456,66,22,78,65,9};
        ArrayList<Integer> even= new ArrayList<>();
        ArrayList<Integer> odd= new ArrayList<>();
        for(int b:a){
            if(b%2==0){
                even.add(b);
            }
            else{
                odd.add(b);
            }
        }
        odd.addAll(even);
        System.out.println(odd);
        Object[] c=odd.toArray();
        System.out.println(c.length);
    }
}
