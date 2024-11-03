import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharArray {
    public static void main(String[] args) {
        String a="sumit sekhar";
        char[] ar=a.toCharArray();
        System.out.println("arraty length"+ar.length);
        System.out.println("String length"+a.length());
        System.out.println(Arrays.toString(ar));
        for (int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
        Arrays.sort(ar);
        System.out.println("Array sort"+Arrays.toString(ar));
        List<String> list=new ArrayList<>(Arrays.asList(a));
        System.out.println("Array List"+list);
    }
}
