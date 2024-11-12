package Java_Coding_Programming;

import java.util.ArrayList;
import java.util.Arrays;

public class StringToArrayList {
    public static void main(String[] args) {
        String a="lead winner Corp lTD";
        String[] b=a.split(" ");
        ArrayList<String> arr=new ArrayList<>(Arrays.asList(b));
        System.out.println(arr.get(1));
    }
}
