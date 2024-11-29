package Java_Coding_Programming.Array_Manupulation;

public class DigitStartingWith1InArray {
    public static void main(String[] args) {
        int[] a={23,45,66,123,67,197,512};
        for (int i=0;i<a.length;i++){
            int c=a[i];
            String d=String.valueOf(c);
            if(d.charAt(0)=='1'){
                System.out.println(c);
            }
        }

    }

}
