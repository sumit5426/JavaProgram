package Java_Coding_Programming.Array_Manupulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysClassMethod {
    public static void main(String[] args) {
        int[] a=new int[2];
        a[0]=1;
        a[1]=2;
        System.out.println(Arrays.toString(a));
        String b="selenium is ui tool";
        List<String> stringToList= new ArrayList<>(Arrays.asList(b));
        //List<Integer> arrayIntToList=new ArrayList<>(Arrays.asList(a));
        //above code will not work because List is int type but it required the Integer type



    }
}
