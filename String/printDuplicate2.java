// Using HashMap
package String;

import java.util.HashMap;
import java.util.Map;

public class printDuplicate2{

    static void printDup(String str){
        HashMap<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if(!count.containsKey(str.charAt(i))){
                count.put(str.charAt(i), 1);
                // System.out.println(count.put(str.charAt(i), 1));
            }
            else{
                count.put(str.charAt(i), count.get(str.charAt(i)) + 1);
                // System.out.println(count.put(str.charAt(i), count.get(str.charAt(i)) + 1));
            }
        }

        for (Map.Entry mapElemnt : count.entrySet()) {
            char key = (char)mapElemnt.getKey();
            int value = ((int)mapElemnt.getValue());

            if(value > 1){
                System.out.println(key + ", Count = "+value);
            }
        }
        }

    public static void main(String[] args){
        String str = "test string";
        printDup(str);
    }
}
