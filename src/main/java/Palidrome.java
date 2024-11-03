public class Palidrome {
   static int h;
    static void methodstatic(){
        System.out.println("static method output");
    }
    public static void main(String[] args) {
        String a="mdam";
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)==a.charAt(a.length()-1-i)){
                System.out.println("it is a plaidrom");
            }
            else {
                System.out.println("not palidrome");
            }
        }
        methodstatic();
        System.out.println(h);

    }
}
