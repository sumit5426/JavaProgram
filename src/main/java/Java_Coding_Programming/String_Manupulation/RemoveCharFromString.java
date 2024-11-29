package Java_Coding_Programming.String_Manupulation;

public class RemoveCharFromString {
    public static void main(String[] args) {
        String a="lead winn3456er Corp l87TD";
        String c=" ";
        for(int i=0;i<a.length();i++) {
            char d = a.charAt(i);
            if((d>='a'&& d<='z')||(d>='A'&& d<='Z') ){
                System.out.print("".trim());
            }
            else {
                System.out.print(d);
            }
        }
    }
}
