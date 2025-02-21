package Java_Coding_Programming.Number_Operation;

public class AllNumberOperationUsingCharConvertor {
        public static void main(String[] args) {
            System.out.println("Hello Geek!");
            int a=153;
            char c=' ';
            int d=0,e=0;
            String b=String.valueOf(a);
            for(int i=0;i<b.length();i++){
                c=b.charAt(i);
                d=c-'0';
                //d = c - '0' → 49 - 48 = 1
                e+=d;
            }
            System.out.println(e);
        }
    }

