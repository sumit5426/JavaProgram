package Java_Coding_Programming;

public class Prime {
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
