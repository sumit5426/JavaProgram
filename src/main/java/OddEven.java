import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] a={34,47,56,78,45,20,90};
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even.add(a[i]);
            }
            else{
                odd.add(a[i]);
            }
        }
        for(Integer d:even){
            System.out.println(d);
        }
        for(Integer e:odd){
            System.out.println("odd number are :" +e);
        }
    }
}
