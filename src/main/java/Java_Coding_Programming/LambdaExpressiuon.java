package Java_Coding_Programming;

interface MathOperation {
    int add(int a, int b);
}
public class LambdaExpressiuon {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        System.out.println(addition.add(5, 3));
    }
}
