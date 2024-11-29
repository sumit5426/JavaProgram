package Java_Coding_Programming.Number_Operation;

public class Prime {
    //0 and 1 is not a prime number , 2 is a prime number
    public static void main(String[] args) {
        int a =6;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                System.out.println("Not prime");
                break;
            }
            else {
                System.out.println("prime");
            }
        }
    }
}
