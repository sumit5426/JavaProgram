package Java_Coding_Programming.Array_Manupulation;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] a = {23, 456, 6, 7, 888, 34, 56, 23, 78};
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) { //if we will change < from > then output will be in descending sorting
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}