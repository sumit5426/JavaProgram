import java.util.ArrayList;
import java.util.*;

public class ArrayRemove {
    public static void main(String[] args) {


        Integer[] a = {50, 90, 70,30,20, 20,80};
        List<Integer> li = new ArrayList<>(Arrays.asList(a));
        System.out.println("enter a digit");
//        Scanner s=new Scanner(System.in);
//        Integer b=s.nextInt();
        Integer c=li.get(li.size()-2);
//        if(li.contains(b)) {
//            li.remove(b);
//        }
      //  Collections.sort(li);
        Collections.sort(li,Collections.reverseOrder());
        System.out.println(li);
        Integer sum=0;
        for(int i=0;i<li.size();i++){
            Integer e=li.get(i);
            sum+=e;
            System.out.println(e);

        }
        System.out.println("sum of all number :"+sum);
        Set<Integer> s=new HashSet<>(li);
        System.out.println(s);

        //System.out.println(li.get(li.size()-2));
    }
}
