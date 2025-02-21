package Java_Coding_Programming.String_Manupulation;

import java.util.HashMap;
import java.util.Map;

public class CharacterMaxMinOccurance {
    public static void main(String[] args) {
        String a = "selenium is automation tool";
        int max=0;
        char ch=' ';
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
            if (value > max) {
                max=value;
              ch= (char) entry.getKey();
            }
        }
        System.out.println(ch);
    }
}
