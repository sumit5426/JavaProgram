package Java_Coding_Programming.Number_Operation;

public class ArmstrongNumber
{
    //153=1^3+5^3+3^3=153
    public static void main(String[] args) {
        int num=153;
        int temp=num;
        int result=0;
        while (temp>0){
           int remainder= temp%10;
           result+=Math.pow(remainder,3);
           temp=temp/10;
        }
        System.out.println(result);
        System.out.println(temp);
        if(result==num){
            System.out.println("number is amrstrong");
        }
        else {
            System.out.println("number is not amrstrong");

        }

    }
}
