package Java_Coding_Programming.Array_Manupulation;

public class MoveAllZeroesinthearray {
    public static void main(String[] args) {
        int[] a = {34, 0, 55, 330, 0, 66, 78, 0, 55};
        int n=0;
        int index=a.length;
    for (int i=0;i<index;i++){
       if(a[i]!=0) {
           a[n++]=a[i];
       }
    }
    while (n<index){
        a[n]=0;
        n++;
    } for (int f:a) {
            System.out.println(f);
        }
    }
}
