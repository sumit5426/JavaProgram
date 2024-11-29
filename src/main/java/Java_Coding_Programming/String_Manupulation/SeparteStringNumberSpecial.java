package Java_Coding_Programming.String_Manupulation;

public class SeparteStringNumberSpecial {
    int roollnum;
    public SeparteStringNumberSpecial(int roll){
        this.roollnum=roll;
    }
    public static void main(String[] args) {
        SeparteStringNumberSpecial sp=new SeparteStringNumberSpecial(50);
        System.out.println(sp.roollnum  );
        String a = "sumit 54#$%^) seKHar";
        String digit = " ";
        String calph = " ";
        String spec = " ";
        String salph= " ";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digit += ch;
            } else if (ch >= 'a' && ch <= 'z' ) {
                calph += ch;
            } else if( ch >= 'A' && ch <= 'Z'){
                salph+=ch;
            }
            else {
                spec += ch;
            }
        }
        System.out.println("String is " + calph + "small alpha "+salph+" number is :" + digit + " special is :" + spec);
    }
}
