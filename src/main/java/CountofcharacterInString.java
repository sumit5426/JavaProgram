public class CountofcharacterInString {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] check = new int[256];
        int[] checkk = new int[256];

        String a = "selenium is a 23 56 !@#$%^&*()_=automation tool";
        char[] b = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            check[c]++;
        }
        for (int i = 0; i < b.length; i++) {
            char c = a.charAt(i);
            checkk[c]++;
        }
        for (int i = 0; i < 256; i++) {
            if (check[i] > 0) {
                System.out.println((char) i + " is number of times :" + check[i]);
            }
        }

    }
}
