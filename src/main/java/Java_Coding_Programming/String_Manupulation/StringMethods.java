package Java_Coding_Programming.String_Manupulation;

public class StringMethods {
    public static void main(String[] args) {
        StringBuffer bs=new StringBuffer("sekhar");
        bs.replace(2,4,"bar");
        System.out.println(bs);
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = "hello";

        System.out.println(s1 == s2); // A
        System.out.println(s1.equals(s2)); // B
        System.out.println(s1 == s3); // C
        System.out.println(s1.equals(s3)); // D

        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;

        System.out.println(i1 == i2); // A
        System.out.println(i3 == i4); // B
        System.out.println(i1.equals(i2)); // C
        System.out.println(i3.equals(i4)); // D

        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        String s5 = "hello";
        StringBuilder sb3 = sb1;

        System.out.println(sb1 == sb2); // A
        System.out.println(sb1.equals(sb2)); // B
        System.out.println(sb1 == sb3); // C
        System.out.println(sb1.equals(s5)); // D
    }
}
