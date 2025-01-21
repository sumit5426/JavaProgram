package Java_Coding_Programming.Array_Manupulation;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int []a={34,12,22,456,22,98,43};
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp =a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<a.length-1;i++){
            if(a[i+1]-a[i]!=0){
                list.add(a[i]);
            }
        }
        System.out.println(list);

    }
}
