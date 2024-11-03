public class FindDuplicateinArray {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String[] a = {"java", "selenium", "postman", "api", "postman"};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].equals(a[j])) {
                    System.out.println("duplicate element is " + a[i]);
                }
            }
        }
    }}
