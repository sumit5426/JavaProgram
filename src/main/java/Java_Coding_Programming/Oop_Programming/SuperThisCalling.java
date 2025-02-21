package Java_Coding_Programming.Oop_Programming;

public class SuperThisCalling {
    private int a;
    SuperThisCalling(int a){
        this(23,45);
        this.a=a;
        this.methodA();
    }
    SuperThisCalling(int b , int c){
        System.out.println(b+c);
    }

    public void methodA(){
        System.out.println("sumit");
    }
    public static void main(String[] args) {
         int d;
         SuperThisCalling superThisCalling=new SuperThisCalling(50);
    }
}
