package Java_Coding_Programming.Array_Manupulation;

import java.util.Arrays;

public class ArrayReverse {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    public static void main(String[] args) {
        System.out.println("sumi");

        int[] b = new int[6];
        int a[] = {23, 45, 67, 89, 56, 45};
        for (int i = a.length - 1, j = 0; i >= 0 && j <= a.length; i--, j++) {
            b[j] = a[i];
        }
        System.out.println("sum");
        System.out.println(Arrays.toString(b));

        //OR

        int []d={34,86,3,355,3,786,987,123};
        int[] e=new int[d.length];
        int j=0;
        for(int i=d.length-1;i>=0;i--){
            e[j]=d[i];
            j++;
        }
        System.out.println(Arrays.toString(e));

    }
}

