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

    }
}

