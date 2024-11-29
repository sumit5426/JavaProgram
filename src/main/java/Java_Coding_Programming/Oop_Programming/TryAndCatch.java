package Java_Coding_Programming.Oop_Programming;

public class TryAndCatch {
    public static void main(String[] args) {
        int a=5;
        int b;
        try{
            b=a/0;
        }
        catch(ArithmeticException e){
            System.out.println("exeption is occur");
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("finally block is executed");
        }

    }
}
