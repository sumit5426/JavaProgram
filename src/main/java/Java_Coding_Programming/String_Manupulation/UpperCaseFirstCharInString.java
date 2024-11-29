package Java_Coding_Programming.String_Manupulation;

public class UpperCaseFirstCharInString {
    public static void main(String[] args) {
        String a = "selenium is a automation tool";
        String[] b = a.split(" ");
        for (int i = 0; i < b.length; i++) {
            String d = b[i];
            System.out.print(" ");
            for (int j = 0; j < d.length(); j++) {
                if (j == 0) {
                    char c = d.charAt(0);
                    c = (char) (c - 32); // Subtract 32 to convert to uppercase
                    System.out.print(c);
                } else {
                    char c = d.charAt(j);
                    System.out.print(c);

                }
            }
        }
    }}
