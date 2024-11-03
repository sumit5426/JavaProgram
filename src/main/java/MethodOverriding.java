class MethodOverriding {
    public void methodparent(int a, int b){
        System.out.println("mehtod one");
    }

    public  void methodparent(int a, String c){
        System.out.println("method overloading");
    }
}
class Child extends MethodOverriding{
    public void methodparent(int a, int b){
        System.out.println("child method");
    }
}
class Main
{
    public static void main(String[] args) {
MethodOverriding mo=new MethodOverriding();
mo.methodparent(2,"simit");
mo.methodparent(4,3);
MethodOverriding mrid=new Child();
mrid.methodparent(2,3);
    }
}