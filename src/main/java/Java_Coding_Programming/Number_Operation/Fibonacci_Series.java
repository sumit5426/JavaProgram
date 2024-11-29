package Java_Coding_Programming.Number_Operation;

public class Fibonacci_Series {
    //0112358
    //sum of current + previous
    //10 summatization series
    public static void main(String[] args) {
        int n1=0,n2=1,n3,length=10;
        System.out.print(n1+" "+n2);
        for (int i=2;i<10;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

        }
    }
}
