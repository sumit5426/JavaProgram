package Java_Coding_Programming;

 class ToStringExample {
     private int a;
     private String b;

     public ToStringExample() {

     }

     public int getA() {
         return a;
     }

     public void setA(int a) {
         this.a = a;
     }

     public String getB() {
         return b;
     }

     @Override
     public String toString() {
         return "ToStringExample{" +
                 "a=" + a +
                 ", b='" + b + '\'' +
                 '}';
     }

     public void setB(String b) {
         this.b = b;
     }


     class MainToString {
         public static void main(String[] args) {

         }
     }
 }
