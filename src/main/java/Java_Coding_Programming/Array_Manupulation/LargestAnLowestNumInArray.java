package Java_Coding_Programming.Array_Manupulation;

public class LargestAnLowestNumInArray {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int a[] ={123,45,456,32,78,102};
        int largest=a[1];
        int lowest=a[1];
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];

            }
            else if ( a[i]<lowest){
                lowest=a[i];
            }

        }
        System.out.println(largest);
        System.out.println(lowest);

    }
}
