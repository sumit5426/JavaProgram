package Java_Coding_Programming.String_Manupulation;

public class Concat {
    public static void main(String[] args) {
        String result = "The total is: " + 10 + 20;
        System.out.println(result);
        String result2 = 10 + 20+"The total is: " ;
        System.out.println(result2);
        StringBuilder sb = new StringBuilder("Hello");
       // String result3 = sb + " World";// error  StringBuilder is an object, and you cannot
        //  directly concatenate a StringBuilder with a string using +
        String result3 = sb.toString() + " World";
        System.out.println(result3);
        String result4 = "" + 123 + 456;
        System.out.println(result4);
        String str1 = "Hello";
        String result5 =  null+str1 ;
        System.out.println(result5);
        String result6 = 1 + 2 + "test" + 3 + 4;
        System.out.println(result6);
        char ch1 = 'A';
        char ch2 = 'B';
        String result7 = ch1 + ch2 + "C";
        System.out.println(result7);


    }
}
