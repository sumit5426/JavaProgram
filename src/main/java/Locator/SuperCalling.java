package Locator;

 public class SuperCalling {
    public SuperCalling(){
        System.out.println("super constructor call");
    }

}
 class Country extends SuperCalling{
    public Country(){
        System.out.println("child class constructor");
    }
    public static void main(String[] args){
        Country c=new Country();
    }
}
