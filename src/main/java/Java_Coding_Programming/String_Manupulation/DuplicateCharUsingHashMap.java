package Java_Coding_Programming.String_Manupulation;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharUsingHashMap {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

        public static void main(String[] args) {
            String text="Leadwinner corrp ltd";
            char[] ch=text.toCharArray();
            HashMap<Character,Integer> dup=new HashMap<>();
            for(char c:ch){
                if(dup.containsKey(c)){
                    dup.put(c,dup.get(c)+1);
                }
                else{
                    dup.put(c,1);
                }

            }
//            for (char c : ch) {
//                dup.put(c, dup.getOrDefault(c, 0) + 1);  // Using getOrDefault
//            }

            for(Map.Entry entry:dup.entrySet()){
                int count=(int) entry.getValue();
                if(count>1){
                    System.out.println(entry.getKey()+ " -"+entry.getValue());
                }
            }
        }
    }

