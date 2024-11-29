package Java_Coding_Programming.String_Manupulation;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {
    public static void main(String[] args) {


        String a = "java is a programming language and is a oop programming";
        Map<String, Integer> map = new HashMap<>();
        String[] b = a.split(" ");
        for (String c : b) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry :map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out  .println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

}

