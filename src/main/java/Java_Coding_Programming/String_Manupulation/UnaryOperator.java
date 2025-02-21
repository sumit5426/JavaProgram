package Java_Coding_Programming.String_Manupulation;

public class UnaryOperator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);  // Output?

        int b = --a;
        System.out.println(a);  // Output?

        int c = a--;

        System.out.println(a);  // Output?
        System.out.println(b);  // Output?
        System.out.println(c);  // Output?

        int x = 10;
        int y = 5;
        int z = x++ + --y;
        System.out.println(x);  // Output?
        System.out.println(y);  // Output?
        System.out.println(z);  // Output?
    }
}
