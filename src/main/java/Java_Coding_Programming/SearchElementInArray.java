package Java_Coding_Programming;

public class SearchElementInArray {
    public static void main(String[] args) {
        int[] a = {23, 45, 789, 45, 78, 98, 12};
        int req = 78;
//   for(int i=0;i<a.length;i++){
//       if(a[i]==req){
//           System.out.println("available");
//           break;
//       }

        for (int s : a) {
            if (s == req) {
                System.out.println("available");
                break;
            }

        }
    }}
