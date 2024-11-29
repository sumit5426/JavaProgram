package Java_Coding_Programming.Oop_Programming;

@FunctionalInterface
interface MathOperation {
    int add(int a, int b);
}

class ExtendsClass implements MathOperation {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

public class LambdaExpressiuon {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a * b;
        System.out.println(addition.add(5, 3));
        ExtendsClass extendsClass=new ExtendsClass();
        int multi=extendsClass.add(5,6);
        System.out.println(multi);

    }
}
