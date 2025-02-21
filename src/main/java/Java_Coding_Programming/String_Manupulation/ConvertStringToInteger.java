package Java_Coding_Programming.String_Manupulation;

import net.bytebuddy.implementation.bytecode.Throw;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        String b="345";
        char c=' ';
        int num=0;
        for(int i=0;i<b.length();i++){
          c=  b.charAt(i);
            if(c<'0' || c>'9'){
                throw  new NumberFormatException("it is a not number");
            }
            else {
               num= num*10+(c-'0');
            }
        }
        System.out.println(num);
    }
}
