package Java_Coding_Programming;

public class StringImmutable {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String original ="Hello";
        String modified= original.concat("world");
        System.out.println(original);
        System.out.println(modified);

        StringBuffer bufforginal=new StringBuffer("lead");
        bufforginal.append("winner");
        System.out.println(bufforginal);

    }
}
