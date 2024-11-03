public class SeparteStringNumberSpecial {
    int roollnum;
    public SeparteStringNumberSpecial(int roll){
        this.roollnum=roll;
    }
    public static void main(String[] args) {
        SeparteStringNumberSpecial sp=new SeparteStringNumberSpecial(50);
        System.out.println(sp.roollnum  );
        String a = "sumit 54#$%^) sekhar";
        String digit = " ";
        String alph = " ";
        String spec = " ";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digit += ch;
            } else if ((ch <= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                alph += ch;
            } else {
                spec += ch;
            }
        }
        System.out.println("String is " + alph + " number is :" + digit + " special is :" + spec);
    }
}
