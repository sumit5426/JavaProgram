package Locator;

public class SpcialCharacter {

    public static void main(String[] args) {
        String a="selenium is #$%^& auto%(*&(){}:<> tool";

        String b=a.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(b);
        String c="sambit sekhar barik";
        String d=c.replace("sekhar","kum");
        System.out.println(d);

    }
}
