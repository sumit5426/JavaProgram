package Java_Coding_Programming;

public class IntergerSortWoutPreDefine {
    public static void main(String[] args) {
//bubble sort
        int  []a={23,45,56,12,78,89};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;

                }}
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
