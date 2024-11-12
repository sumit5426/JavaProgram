package Java_Coding_Programming;

public class NameIntialCharacter {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        StringBuffer bf=new StringBuffer();
        String a="sumit sekhar barik";
        String[] b=a.split(" ");
        for(int i=0;i<b.length;i++){
            char c=b[i].charAt(0);
            bf.append(c+" ");
        }
        System.out.println(bf);

    }
}
