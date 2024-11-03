package JavaPratice;

public class InheirtancePratice {
    int a=34;
    static int b=33;
    static void smethod(){
        int d=3;
    }
}
class SubClass extends InheirtancePratice{

    public void methodsub(){
        System.out.println(a);
    }
    public static void main(String[] args){
        SubClass sb=new SubClass();
        sb.methodsub();
        System.out.println(b);
        InheirtancePratice.smethod();
    }
}
