import java.util.*;
import java.lang.*;

public class RemoveDuplicateWoutPreDefine {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    class HelloWorld {
        public static void main(String[] args) {
            String a = "automation with selenium";
            StringBuffer check = new StringBuffer();
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                boolean value = false;
                for (int j = 0; j < check.length(); j++) {
                    if (c == check.charAt(j)) {
                        value = true;
                        break;
                    }
                }
                if (!value) {
                    check.append(c);
                }
            }
            System.out.println(check);

        }

    }
}
