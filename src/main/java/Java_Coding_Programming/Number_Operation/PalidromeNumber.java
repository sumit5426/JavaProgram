package Java_Coding_Programming.Number_Operation;

public class PalidromeNumber {
    public static void main(String[] args) {
        int a = 234;
        String b = String.valueOf(a);
        String c = "";
        for (int i = b.length() - 1; i >= 0; i--) {
            c += b.charAt(i);
        }
        int d = Integer.parseInt(c);
        System.out.println(d);
    }
}
