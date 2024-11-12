package Java_Coding_Programming;

public class PatternStringDec {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        String a = "retest";

        char c = ' ';

        for (int i = 0; i < a.length(); i++) {

            for (int j = 0; j < a.length() - i; j++) {

                c = a.charAt(j);

                System.out.print(c);

            }

            System.out.println(" ");

        }

    }

}
