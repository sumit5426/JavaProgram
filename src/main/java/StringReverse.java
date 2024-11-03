public class StringReverse {
    public static void main(String[] args) {
        String a= "java is programming language";
        String []c=a.split(" ");
        String b="";
        for (int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
          //  System.out.println(b);

        }
        System.out.println(b);
        for(String d:c)
        System.out.println(d);

    }
}
