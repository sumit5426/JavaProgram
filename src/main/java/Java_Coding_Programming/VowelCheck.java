package Java_Coding_Programming;

public class VowelCheck {

    public static void main(String[] args) {
        String a="selenium";
        int count=0;
        char []b=a.toCharArray();
        for(char c:b){
            if(c=='a'|| c=='i'||c=='o'||c=='e'||c=='u'){
                System.out.println("vowel is available");
                count++;
            }
        }
        System.out.println(count);

    }
}
