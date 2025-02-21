package Java_Coding_Programming.Oop_Programming;

 public class SuperCalling {
    public SuperCalling(int i){
        System.out.println("super constructor call");
    }

}
 class Country extends SuperCalling{
    public Country(){
        super(30);
        System.out.println("child class constructor");
    }
    public static void main(String[] args){
        Country c=new Country();
    }
}
