package Java_Coding_Programming;

public class WordReverseInString {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String a="java is program language";
        String c=" ";
        String d=" ";
        String[] b=a.split(" ");
        for(int i=0;i<b.length;i++){
            c=b[i];
            d=d.concat(" ");
            for(int j=c.length()-1;j>=0;j--){
                d+=c.charAt(j);
            }
        }
        System.out.println(d.trim());

    }
}
