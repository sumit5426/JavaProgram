package Java_Coding_Programming.String_Manupulation;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuringChar {

        public static void main(String[] args) {
            String text = "aabbbcccd";
            System.out.println(maxOccurringCharacter(text));
        }

        public static char maxOccurringCharacter(String s) {
            // Step 1: Count the frequency of each character
            HashMap<Character, Integer> map = new HashMap<>();

            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            // Step 2: Find the character with the highest frequency
            char maxChar = s.charAt(0);  // Initialize with the first character
            int maxCount = 0;  // To track the maximum frequency

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    maxChar = entry.getKey();
                }
            }

            return maxChar;  // Return the character with the maximum count
        }
    }


