package Java_Coding_Programming;

public class CountOfElementinArray {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] a = {23, 45, 78, 68, 45, 78, 64, 78};
        boolean[] counted = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            if (counted[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    counted[j] = true;

                }
            }
            if (count > 1) {
                System.out.println("duplicate element is " + a[i] + " no of times is :" + count);
            }

        }
    }
}
