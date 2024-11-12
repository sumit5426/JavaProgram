package Java_Coding_Programming;

public class LargestAnLowestNumInArray {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int a[] ={23,45,45,32,78,102};
        int largest=a[0];
        int lowest=a[0];
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
