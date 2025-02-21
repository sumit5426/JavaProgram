package Java_Coding_Programming.Number_Operation;

public class AllNumberOperationUsingWhileLoop {
    public static void main(String[] args) {
        System.out.println("Hello Geek!");
        int a = 153;
        int number = a;
        int remainder = 0;
        int sum = 0;
        int reverse = 0;
        int digitcount = 0;
        double palidrome = 0;
        int highest = 0;
        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            sum += remainder;
            palidrome = palidrome + Math.pow(remainder, 3);
            if (highest < remainder) {
                highest = remainder;
            }
            number = number / 10;
            digitcount++;
        }
        System.out.println(sum);
        System.out.println(reverse);
        System.out.println(digitcount);
        System.out.println(palidrome);
        System.out.println(highest);

    }

}
