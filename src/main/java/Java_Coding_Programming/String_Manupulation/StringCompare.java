package Java_Coding_Programming.String_Manupulation;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "coding";
        StringBuffer s2 = new StringBuffer(s1);
        System.out.println(s1.equals(s2));
        //output of this code will be false as s2 is not of a type string.

        String s3 = new String("coding");
        String s4 = new String("CODING");
        System.out.println(s3 = s4);
        //assignment operator

        String s5 = "codingninjas";
        String s6 = "codingninjas";
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));//Output : true
        s5 = s5 + "article";
        s5.concat("sumit");
        System.out.println(s5 == s6);      //Output : false
    }
}
