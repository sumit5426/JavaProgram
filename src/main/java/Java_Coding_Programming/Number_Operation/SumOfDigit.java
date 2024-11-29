package Java_Coding_Programming.Number_Operation;

public class SumOfDigit {
    public static void main(String[] args) {
        int digit=297;
        int temp=digit;
        int sum=0;
        while (temp>0){
            int remainder=temp%10;
            sum+=remainder;
            temp=temp/10;
        }
        System.out.println(sum);

    }
}
