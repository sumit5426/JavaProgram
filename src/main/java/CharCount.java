import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String str = "This is an example";
        countCharacterOccurrences(str);
    }

    public static void countCharacterOccurrences(String inputString) {
        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to a character array
        char[] strArray = inputString.toCharArray();

        // Traverse the character array
        for (char c : strArray) {
            if (c != ' ') { // Ignore spaces
                // If the character is already present in the map, increment its count
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }
int max=0;
        char ch=' ';
        // Print the character counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Occurrences of '" + entry.getKey() + "' = " + entry.getValue());
            if(entry.getValue()>max){
                max=entry.getValue();
                ch=entry.getKey();

            }
            System.out.println("maximum char is"+ch+"number is"+max);
        }

        //highest number of element


        HashMap<Character,Integer> h=new HashMap<>();
        h.put('c',34);
        h.put('s',33);
        for(Map.Entry<Character,Integer> entryy:h.entrySet()){
            System.out.println(entryy.getKey()+entryy.getValue());
        }


    }
}
