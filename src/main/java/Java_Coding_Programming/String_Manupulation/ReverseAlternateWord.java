package Java_Coding_Programming.String_Manupulation;

public class ReverseAlternateWord {
    public static void main(String[] args) {
        String a="Lead winner Corp Ltd Hyderabad";
        String[] b=a.split(" ");
        String c=" ";
        char d=' ';
        StringBuffer buffer=new StringBuffer();
        for (int i=0;i<b.length;i++){
            if(i%2==0){
                buffer.append(b[i]+" ");
            }
            else {

                c=b[i];
            for (int j=c.length()-1;j>=0;j--){
            d=c.charAt(j);
                buffer.append(d);
            }
        }
    }
        System.out.println(buffer);

    }}
