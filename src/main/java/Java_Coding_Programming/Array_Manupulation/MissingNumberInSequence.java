package Java_Coding_Programming.Array_Manupulation;

import java.util.Arrays;

public class MissingNumberInSequence {

        public static void main(String[] args) {
            int []a={5,8,6,7,10};
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
           for (int k=0;k<a.length-1;k++){
               if(a[k+1]-a[k]!=1){
                   System.out.println(a[k]+1);
               }
           }

        }
    }

