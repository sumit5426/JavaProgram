package Java_Coding_Programming.String_Manupulation;

public class RemoveWhiteSpaceOrAnyCharFromString {
    //removing space between the word
    public static void main(String[] args) {
        String a="lead winner Corp lTD";
        String c=" ";
        for(int i=0;i<a.length();i++){
            char d=a.charAt(i);
            if(d!=' '){
                System.out.print(d);
            }
        }
    }
}
