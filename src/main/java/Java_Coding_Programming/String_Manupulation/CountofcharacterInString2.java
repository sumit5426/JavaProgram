package Java_Coding_Programming.String_Manupulation;

import java.util.HashMap;
import java.util.Map;

public class CountofcharacterInString2 {
    public static void main(String[] args) {
        String a = "selenium is automation tool";
        char[] b = a.toCharArray();
        Map<Character, Integer> check = new HashMap<>();
        for (char c : b) {
            if (check.containsKey(c)) {
                check.put(c, check.get(c) + 1);

            } else {
                check.put(c, 1);
            }

        }
        for (Map.Entry entry : check.entrySet()) {
            int value = (int) entry.getValue();
            if (value > 2) {
                System.out.println("char is :" + entry.getKey() + "value is :" + entry.getValue());

            }
        }
    }
}
