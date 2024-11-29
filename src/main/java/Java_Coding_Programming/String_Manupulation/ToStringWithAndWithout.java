package Java_Coding_Programming.String_Manupulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToStringWithAndWithout {
    public static void main(String[] args) {
        List<Integer> number=new ArrayList<>();
        number.add(34);
        number.add(35);
        number.add(8765);
        number.add(121);
        System.out.println(number);
        int[] a=new int[2];
        a[0]=1;
        a[1]=2;
        System.out.println(Arrays.toString(a));
        for(int b:a){
            System.out.println(b);
        }
        String d="selenium is ui";
        char[] e=d.toCharArray();
        System.out.println(Arrays.toString(e));


    }
}
