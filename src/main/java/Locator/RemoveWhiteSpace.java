package Locator;

public class RemoveWhiteSpace {
    //removing space between the word
    public static void main(String[] args) {
        String a="lead winner Corp lTD";
        String c=" ";
        String[] b=a.split(" ");
        for(int i=0;i<b.length;i++){
            c+=b[i];
        }
        System.out.println(c);
    }
}
